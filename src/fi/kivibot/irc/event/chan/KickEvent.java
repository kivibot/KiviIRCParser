/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package fi.kivibot.irc.event.chan;

import fi.kivibot.irc.event.UserEvent;

/**
 *
 * @author Nicklas Ahlskog (kivi@kivibot.fi)
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
        return "[KickEvent server:" + getServer() + ", sender-nick:" 
                + getSenderNick() + ", sender-host:" + getSenderHost() 
                + ", channel:" + getChannel() + ", target:"+getTarget()+", message:"+getMessage()+"]";
    }
}
