package com.company.RecurssionProblems;

public class NoOfZerosInaNumber
{
    static int count(int n,int c)
    {
        if(n%10==n)
            return c;
        int r =n%10;
        if(r==0)
            c++;
        return count(n/10,c);

    }
    static int count(int n)
    {
        return count(n,0);
    }
    public static void main(String[] args)
    {
        System.out.println(count(0350467));
    }
}
