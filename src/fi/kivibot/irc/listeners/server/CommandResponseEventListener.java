/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fi.kivibot.irc.listeners.server;

import fi.kivibot.irc.event.server.CommandResponseEvent;
import fi.kivibot.irc.listeners.IRCEventListener;

/**
 *
 * @author kivi
 */
public interface CommandResponseEventListener extends IRCEventListener {

    public void onCommandResponseEvent(CommandResponseEvent ce);
    
}
