package de.henny022.RiskOnline.Server;

import com.blogspot.debukkitsblog.Util.Server;

/**
 * Created by henny on 24.09.16.
 */
public class ChatServer extends Server
{
    public ChatServer(int port, boolean keepConnectionAlive)
    {
        super(port, true, keepConnectionAlive, false);
    }

    @Override
    public void preStart()
    {
        registerMethods();
    }

    private void registerMethods()
    {
        registerMethod("CHATMESSAGE", (msg, socket) -> System.out.println("[Message]" + msg.get(1) + ": " + msg.get(2)));
    }
}
