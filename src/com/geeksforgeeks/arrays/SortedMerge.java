package com.geeksforgeeks.arrays;

import java.util.Arrays;

/**
 * Created by abhishek on 23/6/16.
 * Link: http://www.geeksforgeeks.org/merge-one-array-of-size-n-into-another-one-of-size-mn/
 */
public class SortedMerge
{
    private static final int NA = -1;

    private static void shiftToEnd(int[] arr)
    {
        int ptr1 = arr.length - 1;
        int ptr2 = arr.length - 1;

        while (ptr1 >= 0 && ptr2 >= 0)
        {
            if (arr[ptr1] == NA)
            {
                while(arr[ptr2] == NA)
                {
                    ptr2--;
                }
                //swap
                //System.out.println(ptr1 + "\t" + ptr2);
                arr[ptr1] = arr[ptr2];
                arr[ptr2] = NA;
                continue;
            }
            ptr1--;
            ptr2--;
        }
    }

    private static void moveToEnd(int[] arr)
    {
        int j = arr.length - 1;
        for (int i = arr.length -1; i >= 0; i--)
        {
            if (arr[i] != NA)
            {
                arr[j] = arr[i];
                j--;
            }
        }
    }

    public static void main(String[] args) {
        int mPlusN[] = {2, 8, NA, NA, NA, 13, NA, 15, 20};
        int N[] = {5, 7, 9, 25};
        int mn = mPlusN.length;
        int n = N.length;
        System.out.println("Before: " + Arrays.toString(mPlusN));

        long startTime = System.nanoTime();
        shiftToEnd(Arrays.copyOf(mPlusN, mPlusN.length));
        long endTime = System.nanoTime();

        moveToEnd(mPlusN);
        long endTime2 = System.nanoTime();

        System.out.println("After Shift: " + Arrays.toString(mPlusN));
        System.out.println(endTime - startTime);
        System.out.println(endTime2 - endTime);
    }
}
