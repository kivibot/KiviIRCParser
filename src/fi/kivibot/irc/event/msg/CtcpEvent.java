/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fi.kivibot.irc.event.msg;

import fi.kivibot.irc.event.UserEvent;

/**
 *
 * @author kivi
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
}
