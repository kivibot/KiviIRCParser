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
public class InviteEvent extends UserEvent {

    private String target;

    public InviteEvent(String server, String sender_nick, String sender_host, String channel, String target) {
        super(server, sender_nick, sender_host, channel);
        this.target = target;
    }

    public String getTarget() {
        return this.target;
    }
    
    @Override
    public String toString() {
        return "[InviteEvent server:" + getServer() + ", sernder-nick:" 
                + getSenderNick() + ", sender-host:" + getSenderHost() 
                + ", channel:" + getChannel() + ", target:"+getTarget()+"]";
    }
}
