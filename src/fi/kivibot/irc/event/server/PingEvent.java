/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fi.kivibot.irc.event.server;

/**
 *
 * @author kivi
 */
public class PingEvent {

    private String msg;

    public PingEvent(String msg) {
        this.msg = msg;
    }

    public String getMessage() {
        return msg;
    }
}
