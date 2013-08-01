/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package fi.kivibot.irc.event.chan;

import fi.kivibot.irc.event.UserEvent;

/**
 *
 * @author Nicklas Ahlskog (kivi@kivibot.fi)
 */
public class TopicEvent extends UserEvent {

    private String message;

    public TopicEvent(String server, String sender_nick, String sender_host, String target, String message) {
        super(server, sender_nick, sender_host, target);
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }

    @Override
    public String toString() {
        return "[TopicEvent server:" + getServer() + ", sender-nick:"
                + getSenderNick() + ", sender-host:" + getSenderHost()
                + ", channel:" + getChannel() + ", message:" + getMessage() + "]";
    }
}
