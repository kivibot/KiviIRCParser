/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fi.kivibot.irc.listeners;

import fi.kivibot.irc.listeners.chan.InviteEventListener;
import fi.kivibot.irc.listeners.chan.JoinEventListener;
import fi.kivibot.irc.listeners.chan.KickEventListener;
import fi.kivibot.irc.listeners.chan.ModeEventListener;
import fi.kivibot.irc.listeners.chan.PartEventListener;
import fi.kivibot.irc.listeners.chan.TopicEventListener;
import fi.kivibot.irc.listeners.conreg.NickEventListener;
import fi.kivibot.irc.listeners.conreg.QuitEventListener;
import fi.kivibot.irc.listeners.msg.CtcpEventListener;
import fi.kivibot.irc.listeners.msg.NoticeEventListener;
import fi.kivibot.irc.listeners.msg.PrivmsgEventListener;
import fi.kivibot.irc.listeners.server.CommandResponseEventListener;
import fi.kivibot.irc.listeners.server.PingEventListener;
import fi.kivibot.irc.listeners.server.WallopsEventListener;

/**
 *
 * @author kivi
 */
public interface OmniListener extends IRCEventListener, InviteEventListener,
        JoinEventListener, KickEventListener, ModeEventListener, PartEventListener,
        TopicEventListener, NickEventListener, QuitEventListener, CtcpEventListener,
        NoticeEventListener, PrivmsgEventListener, CommandResponseEventListener,
        PingEventListener, WallopsEventListener {
}
