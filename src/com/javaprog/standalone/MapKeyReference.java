package com.javaprog.standalone;

import java.util.HashMap;

/**
 * Created by abhishek on 25/6/16.
 */
public class MapKeyReference
{
    public static void main(String[] args)
    {
        HashMap<Object, Integer> map1 = new HashMap<Object, Integer>();
        HashMap<Object, Integer> map2 = new HashMap<Object, Integer>();

        // add same object to both maps as key, and check if changing object in one map changes it in the other
        // Try this with both mutable and immutable objects
        // Note that this won't have any effect on values in the respective maps
        String s1 = "Ram";
        String s2 = "Shyam";
        String s3 = "GhanShyam";

        map1.put(s1, 1);
        map2.put(s1, -1);
        map1.put(s2, 2);
        map2.put(s2, -2);
        map1.put(s3, 3);
        map2.put(s3, -3);
        /*
        System.out.println("map1.get(s1) = " + map1.get(s1));
        System.out.println("map1.get(s2) = " + map1.get(s2));
        System.out.println("map1.get(s3) = " + map1.get(s3));
        System.out.println("map2.get(s1) = " + map2.get(s1));
        System.out.println("map2.get(s2) = " + map2.get(s2));
        System.out.println("map2.get(s3) = " + map2.get(s3));
        */
        RandomObj obj1 = new RandomObj(10, "abhishek");
        map1.put(obj1, 4);
        map2.put(obj1, 5);
        obj1.setData(20);

        System.out.println(map1);
        System.out.println(map2);

        System.out.println(map1.get(new RandomObj(20, "abhishek")));
        System.out.println(map1.get(obj1));
        System.out.println(map2.get(obj1));

        /**
         * Conclusion: If mutable objects are used as key, changing the object will change the key,
         *             coz' the object reference is saved as key, not the object itself
         */
    }
}

class RandomObj
{
    private int data;
    private String str;

    RandomObj(int data, String str)
    {
        this.data = data;
        this.str = str;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public String toString() {
        return "RandomObj{" +
                "data=" + data +
                ", str='" + str + '\'' +
                '}';
    }
}
