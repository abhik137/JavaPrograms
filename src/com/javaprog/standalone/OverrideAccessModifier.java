package com.javaprog.standalone;

/**
 * Created by abhishek on 19/4/16.
 */

class Demo {
    protected void someFunc()
    {
        System.out.println("Parent function");
    }
}

public class OverrideAccessModifier extends Demo{
    public void someFunc()
    {
        /**
         * Package or Private access won't work as they are
         * weaker access privileges (stricter) than protected
         */
        System.out.println("Child function");
    }

    public static void main(String[] args) {
        new Demo().someFunc();
    }
}

/**
 * References: http://stackoverflow.com/questions/215497/difference-among-public-default-protected-and-private
 * http://stackoverflow.com/questions/6851612/java-access-modifiers-and-overriding-methods
 * http://stackoverflow.com/questions/9330001/change-the-access-modifier-of-an-overridden-method-in-java
 * http://stackoverflow.com/questions/28671534/can-i-force-abstract-methods-to-be-protected-when-someone-overrides-them
 */
