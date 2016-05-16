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
    
    public static void main(String[] args)
    {
        NullChecks object = new NullChecks();
        object.mapNullCheck();
    }
}
