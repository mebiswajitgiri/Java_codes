package com.company.OOPS.Static;

public  class InnerClasses
{
    static void hello()
    {
        System.out.println("hello!");
    }
   static class A
    {
        int a;
        A(int a)
        {
            this.a=a;
        }
        void greet()
        {
            System.out.println("It's " + this.a);
        }

    }

//    public static void main(String[] args)
//    {
//        InnerClasses obj = new InnerClasses();
//        InnerClasses.A obj1 = obj.new A(65);
//        obj1.greet();
//        System.out.println();
//    }

}
