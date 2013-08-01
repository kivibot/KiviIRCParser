/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package fi.kivibot.irc.event.msg;

import fi.kivibot.irc.event.UserEvent;

/**
 *
 * @author Nicklas Ahlskog (kivi@kivibot.fi)
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
        return "[PrivmsgEvent server:" + getServer() + ", sender-nick:"
                + getSenderNick() + ", sender-host:" + getSenderHost()
                + ", channel:" + getChannel() + ", message:" + getMessage() + "]";
    }
}
