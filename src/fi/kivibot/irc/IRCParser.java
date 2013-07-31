/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fi.kivibot.irc;

import fi.kivibot.irc.event.chan.InviteEvent;
import fi.kivibot.irc.event.chan.JoinEvent;
import fi.kivibot.irc.event.chan.KickEvent;
import fi.kivibot.irc.event.chan.ModeEvent;
import fi.kivibot.irc.event.chan.PartEvent;
import fi.kivibot.irc.event.chan.TopicEvent;
import fi.kivibot.irc.event.conreg.NickEvent;
import fi.kivibot.irc.event.conreg.QuitEvent;
import fi.kivibot.irc.event.msg.CtcpEvent;
import fi.kivibot.irc.event.msg.NoticeEvent;
import fi.kivibot.irc.event.msg.PrivmsgEvent;
import fi.kivibot.irc.event.server.PingEvent;
import fi.kivibot.irc.event.server.WallopsEvent;
import fi.kivibot.irc.utils.Id2Text;
import java.util.ArrayList;

/**
 *
 * @author kivi
 */
public class IRCParser {

    public IRCParser() {
        Id2Text.init();

    }

    public void Parse(String server, String line) {
        String[] parts = split(line);
        if (isNumeric(parts[0])) {
            //CommandResponseEvent
        } else if (parts[0].equals("PING")) {
            //PING
            PingEvent pe = new PingEvent(server, parts[1]);
        } else {
            String command = parts[1];
            String[] usr = parts[0].split("!");
            switch (command.toUpperCase()) {
                case "NICK":
                    NickEvent ne = new NickEvent(server,usr[0],usr[1],parts[2]);
                    break;
                case "QUIT":
                    QuitEvent qe = new QuitEvent(server,usr[0],usr[1],parts[2]);
                    break;
                case "JOIN":
                    JoinEvent je = new JoinEvent(server,usr[0],usr[1],parts[2]);
                    break;
                case "PART":
                    PartEvent pe = new PartEvent(server,usr[0],usr[1],parts[2],parts[3]);
                    break;
                case "MODE":
                    ModeEvent me = new ModeEvent(server,usr[0],usr[1],parts[2],(parts.length>4?parts[4]:""),parts[3]);
                    break;
                case "TOPIC":
                    TopicEvent te = new TopicEvent(server,usr[0],usr[1],parts[2],parts[3]);
                    break;
                case "INVITE":
                    InviteEvent ie = new InviteEvent(server,usr[0],usr[1],parts[3],parts[2]);
                    break;
                case "KICK":
                    KickEvent ke = new KickEvent(server,usr[0],usr[1],parts[2],parts[3],parts.length==5?parts[4]:"");
                    break;
                case "PRIVMSG":
                    if(parts[3].startsWith("\001")){
                        //ctcp
                        String[] pt = parts[3].split(" ");
                        String asd = "";
                        for(int i=1; i<pt.length; i++){
                            asd += pt[i];
                        }
                        CtcpEvent cp = new CtcpEvent(server,usr[0],usr[1],parts[2],pt[0],asd);
                    }else{
                        //normal
                        PrivmsgEvent pme = new PrivmsgEvent(server,usr[0],usr[1],parts[2],parts[3]);
                    }
                    break;
                case "NOTICE":
                    NoticeEvent noe = new NoticeEvent(server,usr[0],usr[1],parts[2],parts[3]);
                    break;
                case "WALLOPS":
                    WallopsEvent we = new WallopsEvent(server,parts[2]);
                    break;
                default:
                    //NOT SUPPORTED - NEEDS TO BE FIXED ASAP!
                    System.err.println("NOT SUPPORTED - NEEDS TO BE FIXED ASAP!");
                    System.err.println(line);
                    break;
            }
        }

    }

    private boolean isNumeric(String s) {
        return s.matches("-?\\d+");
    }

    private String[] split(String line) {
        ArrayList<String> al = new ArrayList<>();
        String s = "";
        boolean msg = false;
        boolean st = true;
        for (char c : line.toCharArray()) {
            if (!msg && c == ' ') {
                al.add(s);
                st = false;
            }
            if(!st && c == ':'){
                msg = true;
            }
            s += c;
        }
        if (msg) {
            al.add(s);
        }
        return (String[]) al.toArray();
    }
}
