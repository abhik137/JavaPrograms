package com.javaprog.standalone;

public class TryCatchWithLoop
{
    public static void main(String[] args)
    {
        int a = 5;
        int b = 10;
        
        for (int i = 0; i < 10; i++)
        {
            int result = a + b;
            if (a % 10 != 0)
                a += 5;
            else
                b += 5;
            System.out.println(result);
            try
            {
                if (result % 25 == 0)
                    callError();
            } catch (InternalError e)
            {
                // Just to check if continue works as expected or not
                continue;
            }
            
            System.out.println(" Loop index: " + i);
        }
    }
    
    public static void callError() throws InternalError
    {
        throw new InternalError("Dummy");
    }
}
