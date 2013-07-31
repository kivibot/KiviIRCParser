/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fi.kivibot.irc.listeners.msg;

import fi.kivibot.irc.event.msg.PrivmsgEvent;
import fi.kivibot.irc.listeners.IRCEventListener;

/**
 *
 * @author kivi
 */
public interface PrivmsgEventListener extends IRCEventListener {

    public void onPrivmsgEvent(PrivmsgEvent pe);
    
}
