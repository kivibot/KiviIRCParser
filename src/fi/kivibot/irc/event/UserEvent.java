/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package fi.kivibot.irc.event;

/**
 *
 * @author Nicklas Ahlskog (kivi@kivibot.fi)
 */
public class UserEvent extends IRCEvent {

    private String snick, shost, trg;

    public UserEvent(String server, String sender_nick, String sender_host, String target) {
        super(server);
        snick = sender_nick;
        shost = sender_host;
        trg = target;
    }

    public String getSenderNick() {
        return snick;
    }

    public String getSenderHost() {
        return shost;
    }

    public String getChannel() {
        return trg;
    }

    @Override
    public String toString() {
        return "[UserEvent server:" + getServer() + ", sender-nick:"
                + getSenderNick() + ", sender-host:" + getSenderHost()
                + ", channel:" + getChannel() + "]";
    }
}
