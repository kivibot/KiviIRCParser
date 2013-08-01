/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package fi.kivibot.irc.event.server;

/**
 *
 * @author Nicklas Ahlskog (kivi@kivibot.fi)
 */
public class WallopsEvent extends PingEvent {

    public WallopsEvent(String s, String message) {
        super(s, message);
    }
    
    @Override
    public String toString(){
        return "[WallopsEvent server:"+getServer()+", message:"+getMessage()+"]";
    }
}
