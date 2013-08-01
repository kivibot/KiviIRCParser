/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package fi.kivibot.irc.event.msg;

import fi.kivibot.irc.event.UserEvent;

/**
 *
 * @author Nicklas Ahlskog (kivi@kivibot.fi)
 */
public class CtcpEvent extends UserEvent {

    private String cmd, arg;

    public CtcpEvent(String server, String sender_nick, String sender_host, String target, String command, String arg) {
        super(server, sender_nick, sender_host, target);
        this.cmd = command;
        this.arg = arg;
    }

    public String getCommand() {
        return cmd;
    }

    public String getArgument() {
        return arg;
    }
    
    @Override
    public String toString() {
        return "[CtcpEvent server:" + getServer() + ", sender-nick:" 
                + getSenderNick() + ", sender-host:" + getSenderHost() 
                + ", channel:" + getChannel() + ", command:"+getCommand()+", arg:"+getArgument()+"]";
    }
}
