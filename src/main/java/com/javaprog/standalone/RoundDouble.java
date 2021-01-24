package com.javaprog.standalone;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class RoundDouble
{
    public static double round(double value, int places)
    {
        // ref: http://stackoverflow.com/questions/2808535/round-a-double-to-2-decimal-places
        if (places < 0) throw new IllegalArgumentException();
        
        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
    
    public static void main(String[] args)
    {
        Double value = 9999.123;
        Double percent = 33.111;
        Double splitValue = value * percent / 100.000;
        System.out.println(splitValue);
        splitValue = round(splitValue, 2);
        System.out.println(splitValue);
    }
}
