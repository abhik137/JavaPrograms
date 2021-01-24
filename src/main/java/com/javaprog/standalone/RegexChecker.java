package com.javaprog.standalone;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexChecker
{
    public static void main(String[] args)
    {
        String str1 = "Campa::fsdfe3434::ac3e1ab449de7fad2219dd7e592192b1::1::54d0f370cf88872cd648d065705a7337";
        String str2 = "Campaign#279::fd00151f2c2f80e5090c41f51db42452::1";
        String str3 = "::fd00151f2c2f80e5090c41f51db42452";
        String regex = "::[a-fA-F0-9]{32}";
        
        Pattern pattern = Pattern.compile(regex);
        
        Matcher matcher = pattern.matcher(str1);
        System.out.println(matcher.find());
        matcher = pattern.matcher(str2);
        System.out.println(matcher.find());
        matcher = pattern.matcher(str3);
        System.out.println(matcher.find());
        
        System.out.println(str1.matches(regex));
        System.out.println(str2.matches(regex));
        System.out.println(str3.matches(regex));
    }
}
