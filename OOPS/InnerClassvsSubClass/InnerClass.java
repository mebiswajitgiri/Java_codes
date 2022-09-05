package com.company.OOPS.InnerClassvsSubClass;

public class InnerClass
{
    String name;
    int age;
    InnerClass(String name,int age)
    {
        this.age=age;
        this.name=name;
    }

    void hello()
    {
        System.out.println("you are in innerclass");
    }
    class A
    {
        int num;
        void inner()
        {
            hello();
        }
    }
}
