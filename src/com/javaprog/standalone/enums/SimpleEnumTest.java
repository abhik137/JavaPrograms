package com.javaprog.standalone.enums;

public class SimpleEnumTest
{
    SimpleEnum day;
    
    public SimpleEnumTest(SimpleEnum day)
    {
        this.day = day;
    }
    
    public void tellItLikeItIs() {
        switch (day) {
            case MONDAY:
                System.out.println("Mondays are bad.");
                break;
                    
            case FRIDAY:
                System.out.println("Fridays are better.");
                break;
                         
            case SATURDAY: case SUNDAY:
                System.out.println("Weekends are best.");
                break;
                        
            default:
                System.out.println("Midweek days are so-so.");
                break;
        }
    }
    
    public static void main(String[] args) {
        SimpleEnumTest firstDay = new SimpleEnumTest(SimpleEnum.MONDAY);
        firstDay.tellItLikeItIs();
        SimpleEnumTest thirdDay = new SimpleEnumTest(SimpleEnum.WEDNESDAY);
        thirdDay.tellItLikeItIs();
        SimpleEnumTest fifthDay = new SimpleEnumTest(SimpleEnum.FRIDAY);
        fifthDay.tellItLikeItIs();
        SimpleEnumTest sixthDay = new SimpleEnumTest(SimpleEnum.SATURDAY);
        sixthDay.tellItLikeItIs();
        SimpleEnumTest seventhDay = new SimpleEnumTest(SimpleEnum.SUNDAY);
        seventhDay.tellItLikeItIs();
    }
}
