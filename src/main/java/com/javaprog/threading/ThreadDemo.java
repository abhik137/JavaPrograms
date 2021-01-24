package com.javaprog.threading;

/**
 * Created by abhishek on 19/7/16.
 */
public class ThreadDemo
{
    public static void main(String[] args) {
        StarThread st = new StarThread();
        st.start();
        for (int i = 0; i < 50; i++)
            System.out.println("i = " + i + ", i * i = " + i * i);
    }
}

class StarThread extends Thread
{
    public void run()
    {
        for (int count = 1, row = 1; row < 20; row++, count++)
        {
            for (int i = 0; i < count; i++)
            {
                System.out.print("*");
            }
            System.out.println("\n");
        }
    }
}
