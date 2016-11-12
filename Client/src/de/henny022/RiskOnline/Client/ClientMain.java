package de.henny022.RiskOnline.Client;

/**
 * Created by henny on 24.09.16.
 */
public class ClientMain
{
    public static void main(String[] args)
    {
        ChatClient chatClient = new ChatClient("localhost", 12021, 10*1000);
        try {
            Thread.sleep(20*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        chatClient.sendMessage("ich", "test");
    }
}
