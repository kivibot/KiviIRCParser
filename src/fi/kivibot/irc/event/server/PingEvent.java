/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fi.kivibot.irc.event.server;

import fi.kivibot.irc.event.IRCEvent;

/**
 *
 * @author kivi
 */
public class PingEvent extends IRCEvent{

    private String msg;

    public PingEvent(String server, String msg) {
        super(server);
        this.msg = msg;
    }

    public String getMessage() {
        return msg;
    }
    
    @Override
    public String toString(){
        return "[PingEvent server:"+getServer()+", message:"+getMessage()+"]";
    }
}
