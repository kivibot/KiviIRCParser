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
public class PartEvent extends UserEvent {

    private String message;
    
    public PartEvent(String server, String sender_nick, String sender_host, String target, String message) {
        super(server, sender_nick, sender_host, target);
        this.message = message;
    }
    
    public String getMessage(){
        return this.message;
    }
    
    @Override
    public String toString() {
        return "[PartEvent server:" + getServer() + ", sernder-nick:" 
                + getSenderNick() + ", sender-host:" + getSenderHost() 
                + ", channel:" + getChannel() + ", message:+"+getMessage()+"]";
    }
}
