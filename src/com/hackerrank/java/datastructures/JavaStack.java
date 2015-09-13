package com.hackerrank.java.datastructures;

import java.util.Scanner;
import java.util.Stack;

/* 
 * This code checks for balanced string consisting of different brackets
 * https://www.hackerrank.com/challenges/java-stack
 * http://www.geeksforgeeks.org/check-for-balanced-parentheses-in-an-expression/
 */
public class JavaStack {
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		boolean ans = false;
		while (sc.hasNext()) {
			String input=sc.next();
			ans = isBalanced(input);
			if (ans)
				System.out.println("true");
			else
				System.out.println("false");
		}
	}
	public static boolean isBalanced(String input)
	{
		Stack<Character> st = new Stack<Character>();
        for (int i=0; i<input.length(); i++)
        {
        	char item = input.charAt(i);
        	switch(item)
        	{
			 	case '{':
			 	case '[':
			 	case '(':
			 		st.push(item);
			 		break;
			 	case ')':
			 		if (st.isEmpty() || st.pop() != '(')
			 			return false;
					break;
			 	case ']':
			 		if (st.isEmpty() || st.pop() != '[')
			 			return false;
					break;
			 	case '}':
			 		if (st.isEmpty() || st.pop() != '{')
			 			return false;
					break;
        	}
        }
        return st.isEmpty();
	}
}
