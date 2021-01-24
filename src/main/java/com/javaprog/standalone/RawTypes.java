package com.javaprog.standalone;

import java.util.ArrayList;

public class RawTypes
{
    public static void main(String[] args)
    {
        /* http://stackoverflow.com/questions/2770321/what-is-a-raw-type-and-why-shouldnt-we-use-it */
        /* https://docs.oracle.com/javase/tutorial/java/generics/rawTypes.html */
        ArrayList list = new ArrayList();
        list.add(10);
        System.out.println(list);
    }
}
