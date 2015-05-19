package uk.tldcode;
import org.schwering.irc.lib.IRCConnection;
import org.schwering.irc.lib.IRCEventListener;
import org.schwering.irc.lib.IRCModeParser;
import org.schwering.irc.lib.IRCUser;
import org.schwering.irc.lib.ssl.SSLIRCConnection;
import org.schwering.irc.lib.ssl.SSLTrustManager;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.security.cert.X509Certificate;
import java.util.Hashtable;

public class Client implements IRCEventListener {
    IRCConnection connection;
    public Client(String server, int port,String password,String nick,String username,String realname){
        connection = new IRCConnection(server,new int[]{port},password,nick,username,realname);
    }

    @Override
    public void onRegistered() {

    }

    @Override
    public void onDisconnected() {

    }

    @Override
    public void onError(String s) {

    }

    @Override
    public void onError(int i, String s) {

    }

    @Override
    public void onInvite(String s, IRCUser ircUser, String s2) {

    }

    @Override
    public void onJoin(String s, IRCUser ircUser) {

    }

    @Override
    public void onKick(String s, IRCUser ircUser, String s2, String s3) {

    }

    @Override
    public void onMode(String s, IRCUser ircUser, IRCModeParser ircModeParser) {

    }

    @Override
    public void onMode(IRCUser ircUser, String s, String s2) {

    }

    @Override
    public void onNick(IRCUser ircUser, String s) {

    }

    @Override
    public void onNotice(String s, IRCUser ircUser, String s2) {

    }

    @Override
    public void onPart(String s, IRCUser ircUser, String s2) {

    }

    @Override
    public void onPing(String s) {

    }

    @Override
    public void onPrivmsg(String s, IRCUser ircUser, String s2) {

    }

    @Override
    public void onQuit(IRCUser ircUser, String s) {

    }

    @Override
    public void onReply(int i, String s, String s2) {

    }

    @Override
    public void onTopic(String s, IRCUser ircUser, String s2) {

    }

    @Override
    public void unknown(String s, String s2, String s3, String s4) {

    }
}
