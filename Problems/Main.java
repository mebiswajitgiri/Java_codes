package com.company.Problems;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println(Roundoff(134));
    }
    static int Roundoff(int n)
    {
        int q;
        int r=n%10;
        if(r<=4)
        {
            q = n/10;
            return q*10;
        }
        else
        {
            q=n/10;
            return (q+1)*10;
        }
    }
}
