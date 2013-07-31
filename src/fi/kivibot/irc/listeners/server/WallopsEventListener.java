/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fi.kivibot.irc.listeners.server;

import fi.kivibot.irc.event.server.WallopsEvent;
import fi.kivibot.irc.listeners.IRCEventListener;

/**
 *
 * @author kivi
 */
public interface WallopsEventListener extends IRCEventListener {

    public void onWallopsEvent(WallopsEvent we);
}
