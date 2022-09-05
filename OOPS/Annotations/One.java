package com.company.OOPS.Annotations;

public interface One
{
    default void method()
    {
        System.out.println("I am at One Interface, I am a default a method");
    }
    static void greet()
    {
        System.out.println("hello Biswajit");
    }
}
