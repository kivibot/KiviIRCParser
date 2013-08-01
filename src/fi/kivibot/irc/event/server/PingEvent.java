/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package fi.kivibot.irc.event.server;

import fi.kivibot.irc.event.IRCEvent;

/**
 *
 * @author Nicklas Ahlskog (kivi@kivibot.fi)
 */
public class PingEvent extends IRCEvent {

    private String msg;

    public PingEvent(String server, String msg) {
        super(server);
        this.msg = msg;
    }

    public String getMessage() {
        return msg;
    }

    @Override
    public String toString() {
        return "[PingEvent server:" + getServer() + ", message:" + getMessage() + "]";
    }
}
