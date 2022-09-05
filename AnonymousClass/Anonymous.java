package com.company.AnonymousClass;

public class Anonymous
{
   final  int  num=23;
    interface A {
        void greet();
    }
    A a = new A()
    {
        int x = num;
        void print()
        {
            System.out.println("I am a anonymous class");
        }

        @Override
        public void greet() {

        }
    };
}
