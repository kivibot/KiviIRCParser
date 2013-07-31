/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fi.kivibot.irc.event.chan;

import fi.kivibot.irc.event.UserEvent;

/**
 *
 * @author kivi
 */
public class KickEvent extends UserEvent {

    private String message;

    public KickEvent(String server, String sender_nick, String sender_host, String target, String message) {
        super(server, sender_nick, sender_host, target);
        this.message = message;
    }

    public String getMessage() {
        return this.message;
    }
}
