package com.javaprog.standalone;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SimpleTryCatch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        try
        {
        	int a = sc.nextInt();
        	int b = sc.nextInt();
//        	int a = Integer.parseInt(sc.nextLine());
//        	int b = Integer.parseInt(sc.nextLine());
        	System.out.println(a/b);
        }
        catch (InputMismatchException e)
        {
        	System.out.println("java.util.InputMismatchException");
        	System.out.println(e.toString());
        }
        catch (ArithmeticException e)
        {
        	System.out.println("java.lang.ArithmeticException: / by zero"+e.toString());
        }
        /*catch (NumberFormatException ne)
        {
        	System.out.println("java.util.InputMismatchException");
        }
        */
        /*
		catch (Exception e)
		{
			if(e instanceof InputMismatchException)
            System.out.println("java.util.InputMismatchException");
            else System.out.println(e);
		}*/
	}
}
