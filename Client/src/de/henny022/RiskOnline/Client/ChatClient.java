package de.henny022.RiskOnline.Client;

import com.blogspot.debukkitsblog.Util.Client;
import com.blogspot.debukkitsblog.Util.Datapackage;

/**
 * Created by henny on 24.09.16.
 */
public class ChatClient extends Client
{
    public ChatClient(String address, int port, int timeout) {
        super(address, port, timeout, false, false);
        registerMethods();
        start();
    }

    private void registerMethods()
    {

    }

    public void sendMessage(String name, String message)
    {
        sendMessage(new Datapackage("CHATMESSAGE", name, message));
    }
}
