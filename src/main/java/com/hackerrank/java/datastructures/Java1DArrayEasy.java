package com.hackerrank.java.datastructures;

import java.util.Scanner;

public class Java1DArrayEasy {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int count = 0;
		for (int i=0; i<n; i++)
		{
			arr[i] = sc.nextInt();
		}
		for (int size=1; size<=n; size++)
		{
			int i = 0;
			int j = i + size -1;
			for (i=0; j<n; i++)
			{
				int sum = sumOf(i,j,arr);
				if (sum < 0)
					count++;
				j++;
			}
		}
		System.out.println(count);
	}
	
	public static int sumOf(int i, int j, int[] arr)
	{
		int sum = 0;
		for(;i<=j;i++)
		{
			sum += arr[i];
		}
		return sum;
	}
}
