package com.hackerrank.algorithms.search;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class HackerlandRadioTransmitters {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] x = new int[n];
        for(int x_i=0; x_i < n; x_i++){
            x[x_i] = in.nextInt();
        }
        Arrays.sort(x);
        int answer = calculateMaxTransmitters(k, x);
        System.out.println(answer);
    }
    
    public static int calculateMaxTransmitters(int k, int[] arr)
    {
        /* as house numbering starts from 1, 
         * we can use 0 to denote invalid position,
         * otherwise we'd use -1 if 0 wasn't available */ 
        int u = 0;  // last out of range house's position
        int p = 0;  // last placed transmitter's position
        int totalPlaced = 0;
        for (int i = 0; i < arr.length; i++) {
            int nextIndex = i + 1;
            if(u == 0)
                u = arr[i];
            // is the current house in range?
            boolean uInRange = false;
            if (p > 0 && p+k >= u) {
                uInRange = true;
                u = 0;
                System.out.println(u + "\t" + p + "\t" + arr[nextIndex]);
                continue;
            }
            
            if(!uInRange && nextIndex <= arr.length-1 && 
               arr[nextIndex] - k <= u) {  // if u is not in range but in range of next one
                u = arr[i];
                System.out.println(u + "\t" + p + "\t" + arr[nextIndex]);
                continue;   // just skip to next house
            }
            else
            {
                //place here
                p = arr[i];
                totalPlaced += 1;
                u = 0;
                System.out.println(u + "\t" + p + "\t" );
            }
            
        }
        return totalPlaced;
    }
}
