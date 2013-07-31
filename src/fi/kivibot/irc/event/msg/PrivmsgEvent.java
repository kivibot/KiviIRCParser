/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fi.kivibot.irc.event.msg;

import fi.kivibot.irc.event.UserEvent;

/**
 *
 * @author kivi
 */
public class PrivmsgEvent extends UserEvent {

    private String msg;

    public PrivmsgEvent(String server, String sender_nick, String sender_host, String target, String msg) {
        super(server, sender_nick, sender_host, target);
        this.msg = msg;
    }

    public String getMessage() {
        return msg;
    }
    
    @Override
    public String toString() {
        return "[PrivmsgEvent server:" + getServer() + ", sernder-nick:" 
                + getSenderNick() + ", sender-host:" + getSenderHost() 
                + ", channel:" + getChannel() + ", message:"+getMessage()+"]";
    }
}
