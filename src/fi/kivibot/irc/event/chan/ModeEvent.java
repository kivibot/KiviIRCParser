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
public class ModeEvent extends UserEvent{
    
    private String target,mode;
    
    public ModeEvent(String server, String sender_nick, String sender_host, String channel, String target, String mode) {
        super(server, sender_nick, sender_host, channel);
        this.target = target;
        this.mode = mode;
    }
    
    public String getTarget(){
        return target;
    }
    
    public String getMode(){
        return this.mode;
    }
    
    @Override
    public String toString() {
        return "[ModeEvent server:" + getServer() + ", sernder-nick:" 
                + getSenderNick() + ", sender-host:" + getSenderHost() 
                + ", channel:" + getChannel() + ", target:"+getTarget()+", mode:"+getMode()+"]";
    }
}
