/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/. */
package fi.kivibot.irc.event.server;

import fi.kivibot.irc.event.IRCEvent;
import fi.kivibot.irc.utils.Id2Text;

/**
 *
 * @author Nicklas Ahlskog (kivi@kivibot.fi)
 */
public class CommandResponseEvent extends IRCEvent {
    //***STATIC PART***
    //RPL

    public static final int RPL_WELCOME = 001;
    public static final int RPL_YOURHOST = 002;
    public static final int RPL_CREATED = 003;
    public static final int RPL_MYINFO = 004;
    public static final int RPL_BOUNCE = 005;
    public static final int RPL_USERHOST = 302;
    public static final int RPL_ISON = 303;
    public static final int RPL_AWAY = 301;
    public static final int RPL_UNAWAY = 305;
    public static final int RPL_NOAWAY = 306;
    public static final int RPL_WHOISUSER = 311;
    public static final int RPL_WHOISSERVER = 312;
    public static final int RPL_WHOISOPERATOR = 313;
    public static final int RPL_WHOISSIDLE = 317;
    public static final int RPL_ENDOFWHOIS = 318;
    public static final int RPL_WHOISCHANNELS = 319;
    public static final int RPL_WHOWASUSER = 314;
    public static final int RPL_ENDOFWHOWAS = 369;
    public static final int RPL_LISTSTART = 321;
    public static final int RPL_LIST = 322;
    public static final int RPL_LISTEND = 323;
    public static final int RPL_UNIQOPIS = 325;
    public static final int RPL_CHANNELMODEIS = 324;
    public static final int RPL_NOTOPIC = 331;
    public static final int RPL_TOPIC = 332;
    public static final int RPL_INVITING = 341;
    public static final int RPL_SUMMONING = 342;
    public static final int RPL_INVITELIST = 346;
    public static final int RPL_ENDOFINVITELIST = 347;
    public static final int RPL_EXCEPLIST = 348;
    public static final int RPL_ENDOFEXCEPTLIST = 349;
    public static final int RPL_VERSION = 351;
    public static final int RPL_WHOREPLY = 352;
    public static final int RPL_ENDOFWHO = 315;
    public static final int RPL_NAMREPLY = 353;
    public static final int RPL_ENDOFNAMES = 366;
    public static final int RPL_LINKS = 364;
    public static final int RPL_ENDOFLINKS = 365;
    public static final int RPL_BANLIST = 367;
    public static final int RPL_ENDOFBANLIST = 368;
    public static final int RPL_INFO = 371;
    public static final int RPL_ENDOFINFO = 374;
    public static final int RPL_MOTDSTART = 375;
    public static final int RPL_MOTD = 372;
    public static final int RPL_ENDOFMOTD = 376;
    public static final int RPL_YOUREOPER = 381;
    public static final int RPL_REHASHING = 382;
    public static final int RPL_YOURESERVICE = 383;
    public static final int RPL_TIME = 391;
    public static final int RPL_USERSSTART = 392;
    public static final int RPL_USERS = 393;
    public static final int RPL_ENDOFUSERS = 394;
    public static final int RPL_NOUSERS = 395;
    public static final int RPL_TRACELINK = 200;
    public static final int RPL_TRACECONNECTING = 201;
    public static final int RPL_TRACEHANDSHAKE = 202;
    public static final int RPL_TRACEUNKNOWN = 203;
    public static final int RPL_TRACEOPERATOR = 204;
    public static final int RPL_TRACEUSER = 205;
    public static final int RPL_TRACESERVER = 206;
    public static final int RPL_TRACESERVICE = 207;
    public static final int RPL_TRACENEWTYPE = 208;
    public static final int RPL_TRACECLASS = 209;
    public static final int RPL_TRACERECONNECT = 210;
    public static final int RPL_TRACELOG = 261;
    public static final int RPL_TRACEEND = 262;
    public static final int RPL_STATSLINKINFO = 211;
    public static final int RPL_STATSCOMMAND = 212;
    public static final int RPL_ENDOFSTATS = 219;
    public static final int RPL_STATSUPTIME = 242;
    public static final int RPL_STATSOLINE = 243;
    public static final int RPL_UMODEIS = 221;
    public static final int RPL_SERVLIST = 234;
    public static final int RPL_SERVLISTEND = 235;
    public static final int RPL_LUSERCLIENT = 251;
    public static final int RPL_LUSEROP = 252;
    public static final int RPL_LUSERUNKNOWN = 253;
    public static final int RPL_LUSERCHANNELS = 254;
    public static final int RPL_LUSERME = 255;
    public static final int RPL_ADMINME = 256;
    public static final int RPL_ADMINLOC1 = 257;
    public static final int RPL_ADMINLOC2 = 258;
    public static final int RPL_ADMINEMAIL = 259;
    public static final int RPL_TRYAGAIN = 263;
    //ERR
    public static final int ERR_NOSUCHNICK = 401;
    public static final int ERR_NOSUCHSERVER = 402;
    public static final int ERR_NOSUCHCHANNEL = 403;
    public static final int ERR_CANNOTSENDTOCHAN = 404;
    public static final int ERR_TOOMANYCHANNELS = 405;
    public static final int ERR_WASNOSUCHNICK = 406;
    public static final int ERR_TOOMANYTARGETS = 407;
    public static final int ERR_NOSUCHSERVICE = 408;
    public static final int ERR_NOORIGIN = 409;
    public static final int ERR_NORECIPIENT = 411;
    public static final int ERR_NOTEXTTOSEND = 412;
    public static final int ERR_NOTOPLEVEL = 413;
    public static final int ERR_WILDTOPLEVEL = 414;
    public static final int ERR_BADMASK = 415;
    public static final int ERR_UNKNOWNCOMMAND = 421;
    public static final int ERR_NOMOTD = 422;
    public static final int ERR_NOADMININFO = 423;
    public static final int ERR_FILEERROR = 424;
    public static final int ERR_NONICKNAMEGIVEN = 431;
    public static final int ERR_ERRONEUSNICKNAME = 432;
    public static final int ERR_NICKNAMEINUSE = 433;
    public static final int ERR_NICKCOLLISION = 436;
    public static final int ERR_UNAVAILRESOURCE = 437;
    public static final int ERR_USERNOTINCHANNEL = 441;
    public static final int ERR_NOTONCHANNEL = 442;
    public static final int ERR_USERONCHANNEL = 443;
    public static final int ERR_NOLOGIN = 444;
    public static final int ERR_SUMMONDISABLED = 445;
    public static final int ERR_USERSDISABLED = 446;
    public static final int ERR_NOTREGISTERED = 451;
    public static final int ERR_NEEDMOREPARAMS = 461;
    public static final int ERR_ALREADYREGISTERED = 462;
    public static final int ERR_NOPERMFORHOST = 463;
    public static final int ERR_PASSWDMISMATCH = 464;
    public static final int ERR_YOUREBANNEDCREEP = 465;
    public static final int ERR_YOUWILLBEBANNED = 466;
    public static final int ERR_KEYSET = 467;
    public static final int ERR_CHANNELISFULL = 471;
    public static final int ERR_UNKNOWNMODE = 472;
    public static final int ERR_INVITEONLYCHAN = 473;
    public static final int ERR_BANNEDFROMCHAN = 474;
    public static final int ERR_BADCHANNELKEY = 475;
    public static final int ERR_BADCHANMASK = 476;
    public static final int ERR_NOCHANMODES = 477;
    public static final int ERR_BANLISTFULL = 478;
    public static final int ERR_NOPRIVILEGES = 481;
    public static final int ERR_CHANOPRIVSNEEDED = 482;
    public static final int ERR_CANTKILLSERVER = 483;
    public static final int ERR_RESTRICTED = 484;
    public static final int ERR_UNIXQPPRIVSNEEDED = 485;
    public static final int ERR_NOOPERHOST = 491;
    public static final int ERR_UMODEUNKNOWNFLAGS = 501;
    public static final int ERR_USERSDONTMATCH = 502;
    //*****************
    private int id;
    private String[] args;

    public CommandResponseEvent(String server, int id, String[] s) {
        super(server);
        this.id = id;
        this.args = s;
    }

    public int getID() {
        return id;
    }

    public String[] getArguments() {
        return this.args;
    }

    @Override
    public String toString() {
        return "[CommandResponseEvent server:" + getServer() + ", id:"
                + getID() + ", explanation:" + Id2Text.getResponseName(getID()) + ", args:" + a2s(getArguments()) + "]";
    }

    private String a2s(String[] a) {
        String s = "{";
        for (int i = 0; i < a.length - 1; i++) {
            s += a[i] + ", ";
        }
        s += a[a.length - 1] + "}";
        return s;
    }
}
