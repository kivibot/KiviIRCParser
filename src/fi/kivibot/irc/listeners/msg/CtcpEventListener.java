/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package fi.kivibot.irc.listeners.msg;

import fi.kivibot.irc.event.msg.CtcpEvent;
import fi.kivibot.irc.listeners.IRCEventListener;

/**
 *
 * @author Nicklas Ahlskog (kivi@kivibot.fi)
 */
public interface CtcpEventListener extends IRCEventListener {

    public void onCtcpEvent(CtcpEvent ce);
}
