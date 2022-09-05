package com.company.maths_DSA;
import java.util.ArrayList;

public class Factors
{
    public static void main(String[] args) {
        int num=36;
        factors3(num);
    }
    static void factors(int n)
    {
        System.out.print(1 + " ");
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
                System.out.print(i+ " ");
        }
        System.out.print(n+" ");
    }
    static void factors2(int n)
    {
        int c=1;
        while(c*c<n)
        {
            if(n%c==0)
                System.out.print(c+" " + n/c + " ");
            c++;
        }
        if(c*c==n)
            System.out.print(c+" ");
    }
    static void factors3(int n)
    {
        int c=1;
        ArrayList<Integer> list= new ArrayList<Integer>();
        while(c*c<n)
        {
            if(n%c==0)
            {
                System.out.print(c+" " );
                list.add(n/c);
            }
            c++;
        }
        if(c*c==n)
            System.out.print(c+" ");
        for(int i=list.size()-1;i>=0;i--)
        {
            System.out.print(list.get(i)+" ");
        }
    }
}
