package com.javaprog.standalone.enums;

/* ref:
 * http://docs.oracle.com/javase/tutorial/java/javaOO/enum.html
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
        return value;
    }
}
