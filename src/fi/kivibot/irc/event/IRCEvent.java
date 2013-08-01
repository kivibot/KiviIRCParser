/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package fi.kivibot.irc.event;

/**
 *
 * @author Nicklas Ahlskog (kivi@kivibot.fi)
 */
public class IRCEvent {

    private String server;

    public IRCEvent(String server) {
        this.server = server;
    }

    public String getServer() {
        return server;
    }

    @Override
    public String toString() {
        return "[IRCEvent server:" + getServer() + "]";
    }
}
