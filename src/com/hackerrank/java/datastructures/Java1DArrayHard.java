package com.hackerrank.java.datastructures;

import java.util.Scanner;

public class Java1DArrayHard {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n_tests = sc.nextInt();
		
		for (int t=0; t<n_tests; t++)
		{
			int n = sc.nextInt();	// size of array
			int m = sc.nextInt();	// maxjump
			int [] arr = new int[n];
			int [] arr_visits = new int[n];	// to keep record of no. of visits to an element
			for (int i=0; i<n; i++)
			{
				arr[i] = sc.nextInt();
			}
			int i = 0;
			// solve() implements a sort-of backtrack algo
			boolean ans = solve(i, arr, n, m, arr_visits);
			if (ans)
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
	
	public static boolean solve(int i, int[] arr, int n, int m, int [] arr2)
	{
		arr2[i] += 1;
		if (i+1 >= n || i+m >= n)
		{
			// System.out.println("YES");
			return true;
		}
		if (arr[i+m]==0 && solve(i+m, arr, n, m, arr2))
			return true;
		if (arr[i+1]==0 && solve(i+1, arr, n, m, arr2))
			return true;
		/*
		 * Need to make sure that no node is visited more than once
		 * while retreating by -1, in order to prevent getting caught
		 * in an infinite loop in cases like '0 0' or '0 0 0'
		 */
		if (i>0)
		{
			if (arr[i-1]==0 && arr2[i-1] <=1 && solve(i-1, arr, n, m, arr2))
				return true;
		}
		else
			return false;
		return false;
	}
}
/*
 * Extra Test Cases:
 * Inp:
 * 1
 * 9 4
 * 0 1 1 0 0 1 1 0 1
 * Out:
 * YES
 * Inp:
 * 1
 * 86 52
 * 0 1 1 1 1 0 1 0 0 1 1 0 0 1 0 1 1 0 0 0 1 0 1 0 0 0 1 0 0 0 0 1 0 1 1 1 0 0 0 0 1 1 0 0 1 1 1 0 1 0 0 0 0 1 1 1 1 0 1 1 0 1 1 0 0 0 0 0 0 0 0 1 1 1 1 0 0 1 0 1 1 0 0 1 0 1
 * Out:
 * YES
 */
