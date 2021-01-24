package com.javaprog.standalone;

/*
 * Bottomline: Object references in Java are similar to pointers in C
 * Objects are always passed-by-value 
 * i.e. the reference(address) of the object is passed by value
 * ref: http://stackoverflow.com/questions/40480/is-java-pass-by-reference-or-pass-by-value
 */

class JavaPassByValueAndObjectReferences
{
    /**
     * Java works exactly like C. You can assign a pointer, 
     * pass the pointer to a method, follow the pointer in the method 
     * and change the data that was pointed to. However, you cannot change 
     * where that pointer points.
     */
    /*
     * TODO: Make this example more intuitive. It's kind of vague right now
     * Show how it's done by passing an object to a method and changing the object
     * So, while the value of the variable referencing the object remains same
     * in the caller, the object itself will be changed by the called method
     */
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
