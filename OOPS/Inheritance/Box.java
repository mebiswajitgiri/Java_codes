package com.company.OOPS.Inheritance;

public class Box
{
    double l;
    double b;
    final double h;
    Box()
    {
        this.l=-1.0;
        this.b=-1.0;
        this.h=-1.0;
       // System.out.println("box is created");
    }
    Box(double l,double b,double h)
    {
        this.l=l;
        this.b=b;
        this.h=h;
       // System.out.println("box is created");
    }
    Box(double b)
    {
        this.l=b;
        this.b=b;
        this.h=b;
        //System.out.println("its a square");
    }
    Box(Box prev)
    {
        this.l=prev.l;
        this.b=prev.l;
        this.h=prev.h;
        //System.out.println("same box as previous box");
    }

}
