package com.javaprog.standalone.enums;

import java.util.Arrays;

/* ref:
 * http://docs.oracle.com/javase/tutorial/java/javaOO/enum.html
 * https://stackoverflow.com/questions/604424/lookup-enum-by-string-value#2965252
 */
public enum EnumWithConstructor
{
 // usual names for US coins
    PENNY(1), 
    NICKEL(5), 
    DIME(10), 
    QUARTER(25); 
    // note that the above parentheses and the constructor arguments match
    private int value;
    
    /** 
     * This constructor is for above declared enum values 
     * You cannot assign values to the enums without the constructor 
     */
    EnumWithConstructor(int value) { 
        this.value = value;
    }
    
    /**
     * returns the value associated with the Enum type, 
     * e.g. value of nickel is 5 
     * @return
     */
    public int getValue() {
        // This method is equivalent of toString for String types
        return value;
    }
    
    public String toString()
    {
        // returns the name of the enum
        return name();
    }
    
    /**
     * Get Enum from value
     * @return
     */
    public static EnumWithConstructor fromValue(int val)
    {
        for (EnumWithConstructor enumType : EnumWithConstructor.values())
        {
            if(enumType.getValue() == val)
                return enumType;
        }
        return null;
    }
    
    public static void main(String[] args)
    {
        System.out.println(EnumWithConstructor.valueOf("PENNY"));
        System.out.println(Arrays.toString(EnumWithConstructor.values()));
        System.out.println(EnumWithConstructor.valueOf(EnumWithConstructor.class, "PENNY"));
        System.out.println(EnumWithConstructor.fromValue(5));
        System.out.println(EnumWithConstructor.DIME.toString());
        System.out.println(EnumWithConstructor.DIME.getValue());
    }
}
