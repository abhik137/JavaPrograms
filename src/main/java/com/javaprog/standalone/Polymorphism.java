package com.javaprog.standalone;

class Person
{
    public void method1()
    {
        System.out.println("Person 1");
    }
    public void method2()
    {
        System.out.println("Person 2");
    }
}

class Student extends Person
{
    public void method1()
    {
        System.out.println("Student 1");
        super.method1();
        method2();
    }
    public void method2()
    {
        System.out.println("Student 2");
    }
}

class Undergrad extends Student
{
    public void method2()
    {
        System.out.println("Undergrad 2");
    }
}

public class Polymorphism
{
    public static void main(String[] args)
    {
        Person u = new Undergrad();
        u.method1();
    }
}
