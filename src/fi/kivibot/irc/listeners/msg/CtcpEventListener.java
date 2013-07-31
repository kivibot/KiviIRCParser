/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fi.kivibot.irc.listeners.msg;

import fi.kivibot.irc.event.msg.CtcpEvent;
import fi.kivibot.irc.listeners.IRCEventListener;

/**
 *
 * @author kivi
 */
public interface CtcpEventListener extends IRCEventListener {

    public void onCtcpEvent(CtcpEvent ce);
    
}
