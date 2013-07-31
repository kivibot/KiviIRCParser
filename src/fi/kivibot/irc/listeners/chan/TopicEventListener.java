/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fi.kivibot.irc.listeners.chan;

import fi.kivibot.irc.event.chan.TopicEvent;
import fi.kivibot.irc.listeners.IRCEventListener;

/**
 *
 * @author kivi
 */
public interface TopicEventListener extends IRCEventListener {

    public void onTopicEvent(TopicEvent te);
    
}
