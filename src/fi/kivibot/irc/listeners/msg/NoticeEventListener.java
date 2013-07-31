/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fi.kivibot.irc.listeners.msg;

import fi.kivibot.irc.event.msg.NoticeEvent;
import fi.kivibot.irc.listeners.IRCEventListener;

/**
 *
 * @author kivi
 */
public interface NoticeEventListener extends IRCEventListener {

    public void onNoticeEvent(NoticeEvent ne);
    
}
