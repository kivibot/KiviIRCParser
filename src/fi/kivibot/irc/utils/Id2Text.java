/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package fi.kivibot.irc.utils;

import fi.kivibot.irc.event.server.CommandResponseEvent;
import java.lang.reflect.Field;
import java.util.HashMap;

/**
 *
 * @author Nicklas Ahlskog (kivi@kivibot.fi)
 */
public class Id2Text {

    private static HashMap<Integer, String> ht = new HashMap<>();

    public static void init() {
        Field[] declaredFields = CommandResponseEvent.class.getDeclaredFields();
        for (Field field : declaredFields) {
            if (java.lang.reflect.Modifier.isStatic(field.getModifiers())) {
                try {
                    ht.put(Integer.valueOf((int) field.get(null)), field.getName());
                } catch (IllegalArgumentException | IllegalAccessException ex) {
                }
            }
        }
    }

    public static String getResponseName(int id) {
        return ht.get(Integer.valueOf(id));
    }
}
