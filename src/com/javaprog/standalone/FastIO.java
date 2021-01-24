package com.javaprog.standalone;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by abhishek on 24/5/16.
 */
public class FastIO
{
    static class MyScanner
    {
        BufferedReader br;
        StringTokenizer strtok;

        public MyScanner()
        {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next()
        {
            while(strtok == null || !strtok.hasMoreElements())
            {
                try
                {
                    strtok = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return strtok.nextToken();
        }

        int nextInt()
        {
            return Integer.parseInt(next());
        }
    }
}
