package com.company.OOPS.Demo;

import com.company.OOPS.AccessControl.A;

public class SubClass extends A
{
    public SubClass(int a) {
        super(a);
    }
    void method()
    {
        System.out.println(super.a);
    }

    public static void main(String[] args) {
       A s = new A (45);
       //System.out.println(s.a);
    }
}
