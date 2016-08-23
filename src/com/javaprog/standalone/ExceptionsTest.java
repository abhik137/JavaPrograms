package com.javaprog.standalone;

public class ExceptionsTest
{
    public static void throwError()
        throws InternalError
    {
        throw new InternalError("message");
    }
    
    public static void main(String[] args)
    {
        try
        {
            throwError();
        } 
        catch (InternalError e)
        {
            System.out.println(e.getClass().getSimpleName());
        }
    }
}
