package com.javaprog.threading;

/**
 * Created by abhishek on 20/7/16.
 */
public class CalcPI1
{
    public static void main(String[] args)
    {
        PiThread pt = new PiThread();
        pt.start();
        try
        {
            Thread.sleep(1);   // sleep for 1 milliseconds
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        System.out.println("pi = " + pt.pi);
    }
}
