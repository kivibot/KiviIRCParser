/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package fi.kivibot.irc.event.chan;

import fi.kivibot.irc.event.UserEvent;

/**
 *
 * @author Nicklas Ahlskog (kivi@kivibot.fi)
 */
public class JoinEvent extends UserEvent {

    public JoinEvent(String server, String sender_nick, String sender_host, String target) {
        super(server, sender_nick, sender_host, target);
    }
    
    @Override
    public String toString() {
        return "[JoinEvent server:" + getServer() + ", sender-nick:" 
                + getSenderNick() + ", sender-host:" + getSenderHost() 
                + ", channel:" + getChannel() + "]";
    }
}
