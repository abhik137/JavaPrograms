package com.javaprog.threading;

/**
 * Created by abhishek on 20/7/16.
 */
public class CalcPI2
{
    public static void main(String[] args)
    {
        PiThread pt = new PiThread();
        pt.start();
        while (pt.isAlive()) {
            try {
                Thread.sleep(1);   // sleep for 1 milliseconds
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("pi = " + pt.pi);
    }
}
