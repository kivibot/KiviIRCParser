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
public class KickEvent extends UserEvent {

    private String message, trg;

    public KickEvent(String server, String sender_nick, String sender_host, String chan, String target, String message) {
        super(server, sender_nick, sender_host, chan);
        this.trg = target;
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }

    public String getTarget() {
        return this.trg;
    }
    
    @Override
    public String toString() {
        return "[KickEvent server:" + getServer() + ", sernder-nick:" 
                + getSenderNick() + ", sender-host:" + getSenderHost() 
                + ", channel:" + getChannel() + ", target:"+getTarget()+", message:"+getMessage()+"]";
    }
}
