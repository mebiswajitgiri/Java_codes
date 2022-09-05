package com.company.OOPS.Polymorphism;

public class ObjectPrint
{
    String s ;
    ObjectPrint(String s)
    {
        this.s = s;
    }

    @Override
    public String toString() {
        return this.s;
    }

    public static void main(String[] args) {
        ObjectPrint obj = new ObjectPrint("Biswajit");
        System.out.println(obj);
    }
}
