/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fi.kivibot.irc.listeners.chan;

import fi.kivibot.irc.event.chan.JoinEvent;
import fi.kivibot.irc.listeners.IRCEventListener;

/**
 *
 * @author kivi
 */
public interface JoinEventListener extends IRCEventListener {

    public void onJoinEvent(JoinEvent je);
}
