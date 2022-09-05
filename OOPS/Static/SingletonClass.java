package com.company.OOPS.Static;

public class SingletonClass
{
    String name;
    private SingletonClass()
    {
    }
    private static SingletonClass obj;
    public static SingletonClass getObject()
    {
        if(obj==null)
            obj=new SingletonClass();
        return obj;
    }

}
