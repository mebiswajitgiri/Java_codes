package com.company.OOPS.Abstarct;


public class Son extends Parents
{
    Son(int salary)
    {
        super( salary);
    }
    @Override
    void career()
    {
        System.out.println("i wanna to be Engineer");
    }
    @Override
    void partner()
    {
        System.out.println("I love me");
    }
}
