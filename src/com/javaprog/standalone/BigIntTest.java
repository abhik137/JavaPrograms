package com.javaprog.standalone;

import java.math.BigInteger;

/**
 * Created by abhishek on 25/3/17.
 */
public class BigIntTest {
    public static void main(String[] args) {

        String uniqueString = "11";
        BigInteger uniqueBigInt = new BigInteger(uniqueString);
        System.out.println(uniqueBigInt.toString(36));  // converts to base 36, this is max base to which it'll convert

        // ref: http://stackoverflow.com/questions/17518221/how-does-integer-parseintstring-radix-work
        System.out.println(Integer.parseInt("11", 16)); // here 11 is a base-16 number, which is 17 when printed in base 10
        System.out.println(Integer.toString(11,16));    // here 11 in base-10 is converted to base-16 which is 'b'
    }
}
