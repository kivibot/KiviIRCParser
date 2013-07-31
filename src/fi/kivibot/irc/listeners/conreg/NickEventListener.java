/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fi.kivibot.irc.listeners.conreg;

import fi.kivibot.irc.event.conreg.NickEvent;
import fi.kivibot.irc.listeners.IRCEventListener;

/**
 *
 * @author kivi
 */
public interface NickEventListener extends IRCEventListener {

    public void onNickEvent(NickEvent ne);
    
}
