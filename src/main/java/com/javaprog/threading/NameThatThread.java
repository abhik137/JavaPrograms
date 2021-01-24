package com.javaprog.threading;

/**
 * Created by abhishek on 20/7/16.
 */
public class NameThatThread
{
    public static void main(String[] args)
    {
        MyThread mt;
        if (args.length == 0)
            mt = new MyThread();
        else
            mt = new MyThread(args[0]);
        mt.start();
    }
}

class MyThread extends Thread
{
    MyThread()
    {
        // The compiler creates the byte code equivalent of super ();
        // default super() constructor called automatically by default constructor
    }
    MyThread(String name)
    {
//        super(name);
        setName(name);  // same result
    }
    public void run()
    {
        System.out.println("Name of this thread: " + getName());
    }
}