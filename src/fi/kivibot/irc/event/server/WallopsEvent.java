/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fi.kivibot.irc.event.server;

/**
 *
 * @author kivi
 */
public class WallopsEvent extends PingEvent {

    public WallopsEvent(String s, String message) {
        super(s, message);
    }
    
    @Override
    public String toString(){
        return "[WallopsEvent server:"+getServer()+", message:"+getMessage()+"]";
    }
}
