package com.company.OOPS.AccessControl;

public class B extends A
{
    int b;
    public B(int a,int b)
    {
        super(a);
        this.b = b;
    }

    public static void main(String[] args) {
        A a = new A(56);
        System.out.println(a.a);
        System.out.println();
    }
}
