package com.company.maths_DSA;

public class MagicNumber
{
    public static void main(String[] args)
    {
        int ans=0;
        int n = 6;
        int base=5;
        while(n>0)
        {
            ans +=(n&1)*base;
            base=base*5;
            n=(n>>1);
        }
        System.out.println(ans);
    }
}
