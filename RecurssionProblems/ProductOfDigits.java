package com.company.RecurssionProblems;

public class ProductOfDigits
{
    static int product(int n)
    {
        if(n==0)
            return 1;
        return (n%10)*product(n/10);
    }
    public static void main(String[] args)
    {
        int ans=product(4507);
        //System.out.println(ans);
        pass(5);

    }
    static void pass(int n)
    {
        if(n==0)
            return;
        System.out.println(n);
        pass(--n);
    }
}
