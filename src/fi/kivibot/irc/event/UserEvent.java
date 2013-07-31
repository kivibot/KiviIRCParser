/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fi.kivibot.irc.event;

import fi.kivibot.irc.IRCEvent;

/**
 *
 * @author kivi
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
}
