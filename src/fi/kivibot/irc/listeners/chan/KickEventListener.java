/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fi.kivibot.irc.listeners.chan;

import fi.kivibot.irc.event.chan.KickEvent;
import fi.kivibot.irc.listeners.IRCEventListener;

/**
 *
 * @author kivi
 */
public interface KickEventListener extends IRCEventListener {

    public void onKickEvent(KickEvent ke);
}
