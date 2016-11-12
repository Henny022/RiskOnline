package de.henny022.RiskOnline;

import com.blogspot.debukkitsblog.Util.Datapackage;
import com.blogspot.debukkitsblog.Util.Executable;
import com.blogspot.debukkitsblog.Util.Server;

import java.net.Socket;

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
        registerMethod("CHATMESSAGE", new Executable() {
            @Override
            public void run(Datapackage msg, Socket socket) {
                System.out.println("[Message]" + msg.get(1) + ": " + msg.get(2));
            }
        });
    }
}
