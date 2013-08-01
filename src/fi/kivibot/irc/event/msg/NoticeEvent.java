/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package fi.kivibot.irc.event.msg;

/**
 *
 * @author Nicklas Ahlskog (kivi@kivibot.fi)
 */
public class NoticeEvent extends PrivmsgEvent {

    public NoticeEvent(String server, String sender_nick, String sender_host, String target, String msg) {
        super(server, sender_nick, sender_host, target, msg);
    }

    @Override
    public String toString() {
        return "[NoticeEvent server:" + getServer() + ", sender-nick:"
                + getSenderNick() + ", sender-host:" + getSenderHost()
                + ", channel:" + getChannel() + ", message:" + getMessage() + "]";
    }
}
