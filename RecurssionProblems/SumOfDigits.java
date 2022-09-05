package com.company.RecurssionProblems;

public class SumOfDigits
{
    static int sumOfDigits(int n)
    {
        if(n==0)
            return 0;
        return (n%10)+sumOfDigits(n/10);
    }
    public static void main(String[] args)
    {
        int ans=sumOfDigits(10457);
        System.out.println(ans);

    }
}
