package com.javaprog.networking;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by abhishek on 16/5/16.
 */
public class DailyAdviceServer
{
    String [] adviceList = {"Take smaller bites", "Go for the tight jeans. No they do NOT make you look fat.",
                            "One word: inappropriate", "Just for today, be honest. Tell your boss what you *really* think",
                            "You might want to rethink that haircut."};

    public void go()
    {
        try
        {
            ServerSocket serverSock = new ServerSocket(5000);

            while(true)
            {
                Socket sock = serverSock.accept();

                PrintWriter writer =  new PrintWriter(sock.getOutputStream());
                String advice = getAdvice();
                writer.println(advice);
                writer.close();
                System.out.println(advice);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    private String getAdvice()
    {
        int random = (int) (Math.random() * adviceList.length);
        return adviceList[random];
    }

    public static void main(String[] args) {
        DailyAdviceServer server = new DailyAdviceServer();
        server.go();
    }
}
