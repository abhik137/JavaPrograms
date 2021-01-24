package com.geeksforgeeks.arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by abhishek on 20/6/16.
 * Link: http://www.practice.geeksforgeeks.org/problem-page.php?pid=552
 * Related: https://www.hackerrank.com/challenges/pairs (consider for -ve numbers)
 */
public class FindPairWithSum
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.next());
        for (int i = 0; i < T; i++)
        {
            int size = Integer.parseInt(sc.next());
            int sum = Integer.parseInt(sc.next());
            // System.out.println(size + " " + sum);
            int[] arr = new int[size];
            for (int j = 0; j < size; j++)
            {
                arr[j] = Integer.parseInt(sc.next());
            }
            boolean retVal = solveBySorting(arr, sum, size);
            if (retVal)
                System.out.println("Yes");
            else
                System.out.println("No");
        }
        //System.out.println(T);
    }

    private static boolean solveBySorting(int[] arr, int sum, int length)
    {
        // TODO: improve this implementation, this won't work for multiple pairs (remove else & make test cases), Also consider -ve numbers
        Arrays.sort(arr);
        int left = 0;               // left array ptr
        int right = length - 1;     // right array ptr
        while (left < right)
        {
            if (arr[left] + arr[right] < sum)
                left++;
            else if (arr[left] + arr[right] > sum)
                right--;
            else
                return true;
        }
        return false;
    }
}
