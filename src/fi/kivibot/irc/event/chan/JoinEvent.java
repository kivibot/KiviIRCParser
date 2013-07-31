/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fi.kivibot.irc.event.chan;

import fi.kivibot.irc.event.UserEvent;

/**
 *
 * @author kivi
 */
public class JoinEvent extends UserEvent {

    public JoinEvent(String server, String sender_nick, String sender_host, String target) {
        super(server, sender_nick, sender_host, target);
    }
    
    @Override
    public String toString() {
        return "[JoinEvent server:" + getServer() + ", sernder-nick:" 
                + getSenderNick() + ", sender-host:" + getSenderHost() 
                + ", channel:" + getChannel() + "]";
    }
}
