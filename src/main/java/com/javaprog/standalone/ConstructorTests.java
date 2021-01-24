package com.javaprog.standalone;

public class ConstructorTests
{
    private String str;
    private Boolean flag = false;
    
    public ConstructorTests(String str, Boolean value)
    {
        this.str = str;
        this.flag = value;
    }
    
    public String getStr()
    {
        return str;
    }

    public void setStr(String str)
    {
        this.str = str;
    }

    public Boolean getFlag()
    {
        return flag;
    }

    public void setFlag(Boolean flag)
    {
        this.flag = flag;
    }

    public static void main(String[] args)
    {
        ConstructorTests obj = new ConstructorTests("Hello", null);
        System.out.println(obj.getStr());
        System.out.println(obj.getFlag());
    }
}
