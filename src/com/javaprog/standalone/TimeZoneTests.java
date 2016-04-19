package com.javaprog.standalone;

import java.util.TimeZone;

public class TimeZoneTests
{
    public static void main(String[] args)
    {
        //System.out.println(ZoneId.getAvailableZoneIds());
        String[] timeZoneIds = TimeZone.getAvailableIDs();
        for(String id : timeZoneIds)
        {
            System.out.print(id+"\t");
            TimeZone timeZone = TimeZone.getTimeZone(id);
            //timeZone.getOffset(0);
            int offset = timeZone.getRawOffset();
            String text = 
                String.format("%2s%02d:%02d", offset >= 0 ? "+" : "", offset / 3600000, (offset / 60000) % 60);
            System.out.println(text);
        }
    }
}
