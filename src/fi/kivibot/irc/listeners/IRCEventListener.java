/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fi.kivibot.irc.listeners;

import fi.kivibot.irc.event.IRCEvent;

/**
 *
 * @author kivi
 */
public interface IRCEventListener {
    public void onIRCEvent(IRCEvent e);
}
