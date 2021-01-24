package com.javaprog.networking;

import java.io.*;
import java.net.Socket;

/**
 * Created by abhishek on 16/5/16.
 */
public class DailyAdviceClient
{
    public void go() {
        try {
            Socket sock = new Socket("127.0.0.1", 5000);

            InputStreamReader streamReader = new InputStreamReader(sock.getInputStream());
            BufferedReader reader = new BufferedReader(streamReader);

            String advice = reader.readLine();
            System.out.println("Today you should" + advice);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        DailyAdviceClient client = new DailyAdviceClient();
        client.go();
    }
}
