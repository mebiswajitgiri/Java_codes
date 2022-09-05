package com.company.OOPS.Inheritance;

public class NotIdealBox extends Box
{
    double w;
    public NotIdealBox()
    {
        super();
        this.w=-1;
    }
    NotIdealBox(double l,double b,double h,double w)
    {
        super(l,b,h);
        this.w=w;
    }
    NotIdealBox(double l)
    {
        super(l);
        this.w=l;
    }
    NotIdealBox(Box box,double w)
    {
        super(box);
        this.w=w;
    }
    void m (){
        System.out.println(super.h);
}
}
