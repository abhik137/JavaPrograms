package com.javaprog.standalone;

public class SwitchDemo
{
    public static void main(String[] args) {
        
        int month = 8;
        String monthString;
        for (int i = 1; i <= 12; i++)
        {
            switch (i) {
                case 1:  monthString = "January";
                         break;
                case 2:  monthString = "February";
                         break;
                case 3:  monthString = "March";
                         break;
                case 4:  monthString = "April";
                         break;
                case 5:  monthString = "May";
                         if (10 == (5 * 2))
                         {
                             System.out.println("Yay! I want to break free!!");
                             break;
                         }
                         System.out.println("I haven't broken free :(");
                         break;
                case 6:  monthString = "June";
                         break;
                case 7:  monthString = "July";
                         break;
                case 8:  monthString = "August";
                         break;
                case 9:  monthString = "September";
                         break;
                case 10: monthString = "October";
                         break;
                case 11: monthString = "November";
                         break;
                case 12: monthString = "December";
                         break;
                default: monthString = "Invalid month";
                         break;
            }
            System.out.println(monthString);
        }
    }
}
