/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package fi.kivibot.irc.listeners.conreg;

import fi.kivibot.irc.event.conreg.QuitEvent;
import fi.kivibot.irc.listeners.IRCEventListener;

/**
 *
 * @author Nicklas Ahlskog (kivi@kivibot.fi)
 */
public interface QuitEventListener extends IRCEventListener {

    public void onQuitEvent(QuitEvent qe);
}
