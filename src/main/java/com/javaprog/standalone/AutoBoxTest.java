package com.javaprog.standalone;

/**
 * Created by abhishek.k on 5/4/16.
 */
public class AutoBoxTest {
    Integer i;
    int j;
    public static void main (String[] args) {
        AutoBoxTest t = new AutoBoxTest();
        t.go();
    }
    public void go() {
//        j = 10;
        j=i;
//        i=j;
        System.out.println(j);
        System.out.println(i);
    }
}
