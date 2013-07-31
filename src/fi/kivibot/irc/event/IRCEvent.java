/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fi.kivibot.irc.event;

/**
 *
 * @author kivi
 */
public class IRCEvent {
    private String server;
    
    public IRCEvent(String server){
        this.server = server;
    }
    
    public String getServer(){
        return server;
    }
    
    @Override
    public String toString(){
        return "[IRCEvent server:"+getServer()+"]";
    }
    
}
