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
import fi.kivibot.irc.event.server.CommandResponseEvent;
import fi.kivibot.irc.event.server.PingEvent;
import fi.kivibot.irc.event.server.WallopsEvent;
import fi.kivibot.irc.listeners.OmniListener;
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

    public void Parse(String server, String line, OmniListener ol) {
        String[] parts = split(line);
        if (parts[0].equals("PING")) {
            //PING
            PingEvent pe = new PingEvent(server, parts[1]);
            ol.onPingEvent(pe);
            ol.onIRCEvent(pe);
        } else {
            String command = parts[1];
            
            if (isNumeric(command)) {
                String[] sr = new String[parts.length-2];
                System.arraycopy(parts, 2, sr, 0, sr.length);
                CommandResponseEvent cre = new CommandResponseEvent(server, Integer.parseInt(parts[1]), sr);
                ol.onCommandResponseEvent(cre);
                ol.onIRCEvent(cre);
                return;
            }
            
            String[] usr = parts[0].contains("!")?parts[0].split("!"):new String[]{parts[0],parts[0]};
            switch (command.toUpperCase()) {
                case "NICK":
                    NickEvent ne = new NickEvent(server,usr[0],usr[1],parts[2]);
                    ol.onNickEvent(ne);
                    ol.onIRCEvent(ne);
                    break;
                case "QUIT":
                    QuitEvent qe = new QuitEvent(server,usr[0],usr[1],parts[2]);
                    ol.onQuitEvent(qe);
                    ol.onIRCEvent(qe);
                    break;
                case "JOIN":
                    JoinEvent je = new JoinEvent(server,usr[0],usr[1],parts[2]);
                    ol.onJoinEvent(je);
                    ol.onIRCEvent(je);
                    break;
                case "PART":
                    PartEvent pe = new PartEvent(server,usr[0],usr[1],parts[2],parts[3]);
                    ol.onPartEvent(pe);
                    ol.onIRCEvent(pe);
                    break;
                case "MODE":
                    ModeEvent me = new ModeEvent(server,usr[0],usr[1],parts[2],(parts.length>4?parts[4]:""),parts[3]);
                    ol.onModeEvent(me);
                    ol.onIRCEvent(me);
                    break;
                case "TOPIC":
                    TopicEvent te = new TopicEvent(server,usr[0],usr[1],parts[2],parts[3]);
                    ol.onTopicEvent(te);
                    ol.onIRCEvent(te);
                    break;
                case "INVITE":
                    InviteEvent ie = new InviteEvent(server,usr[0],usr[1],parts[3],parts[2]);
                    ol.onInviteEvent(ie);
                    ol.onIRCEvent(ie);
                    break;
                case "KICK":
                    KickEvent ke = new KickEvent(server,usr[0],usr[1],parts[2],parts[3],parts.length==5?parts[4]:"");
                    ol.onKickEvent(ke);
                    ol.onIRCEvent(ke);
                    break;
                case "PRIVMSG":
                    if(parts[3].startsWith("\u0001")){
                        //ctcp
                        String[] pt = parts[3].replace("\u0001", "").split(" ");
                        String asd = "";
                        for(int i=1; i<pt.length-1; i++){
                            asd += pt[i] + " ";
                        }
                        asd += pt[pt.length-1];
                        CtcpEvent cp = new CtcpEvent(server,usr[0],usr[1],parts[2],pt[0],asd);
                        ol.onCtcpEvent(cp);
                        ol.onIRCEvent(cp);
                    }else{
                        //normal
                        PrivmsgEvent pme = new PrivmsgEvent(server,usr[0],usr[1],parts[2],parts[3]);
                        ol.onPrivmsgEvent(pme);
                        ol.onIRCEvent(pme);
                    }
                    break;
                case "NOTICE":
                    NoticeEvent noe = new NoticeEvent(server,usr[0],usr[1],parts[2],parts[3]);
                    ol.onNoticeEvent(noe);
                    ol.onIRCEvent(noe);
                    break;
                case "WALLOPS":
                    WallopsEvent we = new WallopsEvent(server,parts[2]);
                    ol.onWallopsEvent(we);
                    ol.onIRCEvent(we);
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
                s = "";
                st = false;
                continue;
            }
            if(!st && c == ':'){
                msg = true;
                continue;
            }
            if(st && c == ':'){
                continue;
            }
            s += c;
        }
        if (msg) {
            al.add(s);
        }
        String[] sa = new String[al.size()];
        al.toArray(sa);
        return sa;
    }
}
