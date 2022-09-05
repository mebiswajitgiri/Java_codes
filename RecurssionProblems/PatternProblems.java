package com.company.RecurssionProblems;

public class PatternProblems
{
    public static void main(String[] args)
    {
        //q1(4);
        q11(3,0);
        //normalTriangle(3,0);

    }
    static void q1(int n)
    {
        if(n==0)
            return;
        for(int i=1;i<n;i++)
        {
            System.out.print("* ");
        }
        System.out.println("*");
        q1(--n);
    }
    static void q11(int r,int c)
    {
        if(r==0)
            return;
        if(r>c)
        {
            System.out.print("* ");
            q11(r,++c);
        }
        else
        {
            System.out.println();
            q11(--r,0);
        }
    }
    static void normalTriangle(int r,int c)
    {
        if(r==0)
            return;
        if(r>c)
        {
            normalTriangle(r,++c);
            System.out.print("* ");
        }
        else
        {
            normalTriangle(--r,0);
            System.out.println();
        }
    }
}
