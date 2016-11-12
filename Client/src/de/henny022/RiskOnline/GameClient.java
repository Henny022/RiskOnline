package de.henny022.RiskOnline;

import com.blogspot.debukkitsblog.Util.Client;

/**
 * Created by henny on 24.09.16.
 */
public class GameClient extends Client
{
    public GameClient(String address, int port, int timeout) {
        super(address, port, timeout, false, false);
        registerMethods();
        start();
    }

    private void registerMethods()
    {

    }

}
