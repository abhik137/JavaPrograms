package com.javaprog.standalone;

import java.util.HashMap;
import java.util.Map;

public class NullChecks
{
    public void mapNullCheck()
    {
        Map<String, String> map = new HashMap<String, String>();
        map.put("one", "string1");
        if(map.get("two") != null)
        {
            System.out.println(map.get("two"));
        }
        else
        {
            System.out.println(map.get("one"));
        }
    }
    
    public void nullKaToString()
    {
        Object a = "abc";
        Object b = null;
        System.out.println(a);
        System.out.println(b);
    }
    
    public static void main(String[] args)
    {
        NullChecks object = new NullChecks();
        object.mapNullCheck();
        object.nullKaToString();
    }
}
