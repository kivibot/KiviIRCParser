/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fi.kivibot.irc.listeners.chan;

import fi.kivibot.irc.event.chan.PartEvent;
import fi.kivibot.irc.listeners.IRCEventListener;

/**
 *
 * @author kivi
 */
public interface PartEventListener extends IRCEventListener {

    public void onPartEvent(PartEvent pe);
    
}
