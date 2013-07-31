/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fi.kivibot.irc.event.conreg;

import fi.kivibot.irc.event.IRCEvent;

/**
 *
 * @author kivi
 */
public class QuitEvent extends IRCEvent {

    private String snick, shost, trg;

    public QuitEvent(String server, String sender_nick, String sender_host, String msg) {
        super(server);
        snick = sender_nick;
        shost = sender_host;
        trg = msg;
    }

    public String getMessage() {
        return this.trg;
    }
    
    public String getSenderNick() {
        return snick;
    }

    public String getSenderHost() {
        return shost;
    }
    
    @Override
    public String toString() {
        return "[NickEvent server:" + getServer() + ", sernder-nick:" 
                + getSenderNick() + ", sender-host:" + getSenderHost() 
                + ", message:" + getMessage() + "]";
    }
}
