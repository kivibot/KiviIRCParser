/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fi.kivibot.irc.event.server;

/**
 *
 * @author kivi
 */
public class CommandResponseEvent {
    private int id;
    private String arg;
    
    public CommandResponseEvent(int id, String s){
        this.id = id;
        this.arg = s;
    }
    
    public int getID(){
        return id;
    }
    
    public String getArgument(){
        return this.arg;
    }
}
