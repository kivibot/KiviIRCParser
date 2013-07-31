/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fi.kivibot.irc.event.msg;

/**
 *
 * @author kivi
 */
public class NoticeEvent extends PrivmsgEvent {

    public NoticeEvent(String server, String sender_nick, String sender_host, String target, String msg) {
        super(server, sender_nick, sender_host, target, msg);
    }
    
    @Override
    public String toString() {
        return "[NoticeEvent server:" + getServer() + ", sernder-nick:" 
                + getSenderNick() + ", sender-host:" + getSenderHost() 
                + ", channel:" + getChannel() + ", message:"+getMessage()+"]";
    }
}
