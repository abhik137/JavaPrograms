package com.geeksforgeeks.arrays;

import java.util.Scanner;

/**
 * Created by abhishek on 21/6/16.
 * Link: http://www.geeksforgeeks.org/majority-element/
 * Ref: http://stackoverflow.com/questions/780937/linear-time-voting-algorithm-i-dont-get-it
 *      http://stackoverflow.com/questions/278488/find-the-most-common-entry-in-an-array
 *      http://stackoverflow.com/questions/278488/find-the-most-common-entry-in-an-array/36243686#36243686
 *      http://www.cs.utexas.edu/users/moore/best-ideas/mjrty/index.html
 */
public class MajorityElement
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while (T > 0)
        {
            int N = sc.nextInt();
            int[] arr = new int[N];
            for (int i = 0; i < N; i++)
            {
                arr[i] = sc.nextInt();
            }
            int candidate = findPossibleCandidate(arr, N);
            if (verifyMajority(arr, N, candidate))
                System.out.println(candidate);
            else
                System.out.println("NO Majority Element");
            T--;
        }
    }

    /**
     * Finds the correct element if the majority element exists, otherwise not
     * @return could be modified for the case of a string
     */
    private static int findPossibleCandidate(int[] arr, int size)
    {
        int possible_elem_idx = 0;
        int count = 0;
        for (int i = 0; i < size; i++)
        {
            if (count == 0)
            {
                possible_elem_idx = i;
                count++;
            }
            else if (arr[i] == arr[possible_elem_idx])
            {
                count++;
            }
            else
            {
                count--;
            }
        }
        return arr[possible_elem_idx];
    }

    private static boolean verifyMajority(int[] arr, int size, int elem)
    {
        int count = 0;
        for (int i = 0; i < size; i++)
        {
            if (arr[i] == elem)
                count++;
        }
        if (count > size/2)
            return true;
        else
            return false;
    }
}
