package com.company.AnonymousClass;

public class Main
{


    public static void main(String[] args)
    {
        A a = new  A(98)
        {
            @Override
            public int printNum()
            {
                return 67;
            }
        };
        B b = new B()
        {
            public int print(int num)
            {
                return num;
            }
        };
        System.out.println( a.printNum());
        System.out.println(b.print(89));
    }
}
