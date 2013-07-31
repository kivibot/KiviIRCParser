/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fi.kivibot.irc.event.conreg;

import fi.kivibot.irc.IRCEvent;

/**
 *
 * @author kivi
 */
public class NickEvent extends IRCEvent {

    private String snick, shost, trg;

    public NickEvent(String server, String sender_nick, String sender_host, String name) {
        super(server);
        snick = sender_nick;
        shost = sender_host;
        trg = name;
    }

    public String getNewNick() {
        return this.trg;
    }
}
