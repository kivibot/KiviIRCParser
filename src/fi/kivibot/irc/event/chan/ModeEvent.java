/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package fi.kivibot.irc.event.chan;

import fi.kivibot.irc.event.UserEvent;

/**
 *
 * @author Nicklas Ahlskog (kivi@kivibot.fi)
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
        return "[ModeEvent server:" + getServer() + ", sender-nick:" 
                + getSenderNick() + ", sender-host:" + getSenderHost() 
                + ", channel:" + getChannel() + ", target:"+getTarget()+", mode:"+getMode()+"]";
    }
}
