package com.javaprog.bitops;

import java.util.BitSet;

public class BitSetTest {


    public static void main(String[] args) {
        BitSet bitSet = new BitSet();
        System.out.println(bitSet);
        bitSet.set(1);
        System.out.println(bitSet);
        bitSet.set(3,7,true);
        System.out.println(bitSet);
        bitSet.get(2,6);
        System.out.println(bitSet);
        System.out.println(bitSet.length());
        System.out.println(bitSet.size());
        System.out.println(bitSet.get(5));
        System.out.println(bitSet.get(2));
        System.out.println(bitSet.get(0));
        System.out.println(bitSet.cardinality());
        //bitSet.set(12,65, true);
        bitSet.set(69);
        System.out.println(bitSet);
        System.out.println(bitSet.length());
        System.out.println(bitSet.size());
        /* Observation: Initial Bitset size in of 64bits
         * One bit stores one bit value (0/1), which is obvious
         * Size increases in steps of 64bits, using 65 bits sets size to 128*/
    }
}
