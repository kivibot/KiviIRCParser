/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fi.kivibot.irc.utils;

import fi.kivibot.irc.event.server.CommandResponseEvent;
import java.lang.reflect.Field;
import java.util.HashMap;

/**
 *
 * @author kivi
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
    
    public static String getResponseName(int id){
        return ht.get(Integer.valueOf(id));
    }
}
