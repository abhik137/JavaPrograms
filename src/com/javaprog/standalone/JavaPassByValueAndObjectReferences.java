package com.javaprog.standalone;

/*
 * Bottomline: Object references in Java are similar to pointers in C
 * Objects are always passed-by-value 
 * i.e. the reference(address) of the object is passed by value
 * ref: http://stackoverflow.com/questions/40480/is-java-pass-by-reference-or-pass-by-value
 */

class JavaPassByValueAndObjectReferences
{
    public static void main(String[] args)
    {
        Dog aDog = new Dog("Max");

        if (aDog.getName().equals("Max"))
        {
            System.out.println("Java passes by value");
        }
        else if (aDog.getName().equals("Fifi"))
        {
            System.out.println("Java passes by reference");
        }
    }

    public static void foo(Dog d) {
        d.getName().equals("Max");  //true

        d = new Dog("Fifi");
        d.getName().equals("Fifi"); //true
    }
}

class Dog
{
    private String name;

    public Dog(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }   
}
