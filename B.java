package com.company;

public class B extends A
{
    long registration_no;
    public B(String name,int age,long registration_no)
    {
        super(name,age);
        this.registration_no=registration_no;
    }
}
