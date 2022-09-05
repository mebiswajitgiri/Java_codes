package com.company.OOPS.InnerClassvsSubClass;

public class Main
{
    public static void main(String[] args) {
        InnerClass obj = new InnerClass("Biswajit",22);
        InnerClass.A a = obj.new A();
        //a.hello();
        SubClass obj2 = new SubClass("bis",23,18);
        obj2.hello();
    }
}
