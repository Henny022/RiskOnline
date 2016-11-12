package de.henny022.RiskOnline.Server;

import com.blogspot.debukkitsblog.Util.Server;

/**
 * Created by henny on 24.09.16.
 */
public class GameServer extends Server
{
    public GameServer(int port, boolean keepConnectionAlive)
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

    }
}
