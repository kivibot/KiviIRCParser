/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package fi.kivibot.irc.event.conreg;

import fi.kivibot.irc.event.IRCEvent;

/**
 *
 * @author Nicklas Ahlskog (kivi@kivibot.fi)
 */
public class QuitEvent extends IRCEvent {

    private String snick, shost, trg;

    public QuitEvent(String server, String sender_nick, String sender_host, String msg) {
        super(server);
        snick = sender_nick;
        shost = sender_host;
        trg = msg;
    }

    public String getMessage() {
        return this.trg;
    }

    public String getSenderNick() {
        return snick;
    }

    public String getSenderHost() {
        return shost;
    }

    @Override
    public String toString() {
        return "[NickEvent server:" + getServer() + ", sender-nick:"
                + getSenderNick() + ", sender-host:" + getSenderHost()
                + ", message:" + getMessage() + "]";
    }
}
