package com.javaprog.concurrency.threadLocks;

/**
 * Created by abhishek on 25/8/16.
 */
public class HelloWorld {
    public static void main(String[] args) throws InterruptedException {
        Thread myThread = new Thread() {
            public void run() {
                System.out.println("Hello from new thread");
            }
        };
        myThread.start();
        Thread.yield();
        System.out.println("Hello from main thread");
        myThread.join();
    }
}
