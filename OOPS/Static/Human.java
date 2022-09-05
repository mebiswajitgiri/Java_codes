package com.company.OOPS.Static;

public class Human
{
    int age;
    String name;
    int salary;
    boolean married;
    static long population=10;
    static void greeting()
    {
        System.out.println("Hello World");
    }
    void greeting2()
    {
        System.out.println("Hello World");
    }
    Human()
    {

    }
    Human (int age,String name,int salary,boolean married)
    {
        this.age=age;
        this.name=name;
        this.salary=salary;
        this.married=married;
        Human.population+=1;
    }

}
