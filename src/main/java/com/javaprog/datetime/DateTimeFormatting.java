package com.javaprog.datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/** ref: https://www.baeldung.com/java-datetimeformatter */
public class DateTimeFormatting {
    public static void main(String[] args) {
        LocalDateTime currentDateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ISO_DATE_TIME;
        System.out.println(currentDateTime.format(formatter));

        String dateTimeStr = getDateTimeString();
        System.out.println(dateTimeStr);
    }

    private static String getDateTimeString() {
        LocalDateTime time = LocalDateTime.now();
        String datePattern = "dd LLLL yyyy, HH:mm";     // Example: 5 July 2020, 20:53
        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern(datePattern);
        return dateFormatter.format(time);
    }
}