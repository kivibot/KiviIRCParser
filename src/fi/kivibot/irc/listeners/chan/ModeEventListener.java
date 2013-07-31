/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fi.kivibot.irc.listeners.chan;

import fi.kivibot.irc.event.chan.ModeEvent;
import fi.kivibot.irc.listeners.IRCEventListener;

/**
 *
 * @author kivi
 */
public interface ModeEventListener extends IRCEventListener {

    public void onModeEvent(ModeEvent me);
}
