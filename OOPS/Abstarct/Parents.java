package com.company.OOPS.Abstarct;

public abstract class Parents
{
    int income;
    Parents(int income)
    {
        this.income=income;
    }
//    static abstract void m();
    static void hello()
    {
        System.out.println("Hello!");
    }
    final void hi()
    {
        System.out.println("Hi");
    }
    void hello2()
    {
        System.out.println("hello2!");
    }
    class A
    {
        void m2()
        {
            Parents.hello();
        }
    }
    abstract void career();
    abstract void partner();
}
