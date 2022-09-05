package com.company;

public class Recursion_Prime
{
    public static void main(String[] args) {
        int num = 1;
        System.out.println(prime(num,2));
        int N =5;
        System.out.println(sum(5,1,0));
    }
    static boolean prime(int num,int n)
    {
        if(num==1)
            return true;
        if(num/n < n)
            return true;
        int N=num/n;
        if(N*n==num)
            return false;
        return prime(num,n+1);
    }
    //sum of  natural number
    static int sum(int N,int n,int sum)
    {
        if(n==N)
            return sum+n;
        sum=sum+n;
        return sum(N,n+1,sum);

    }
}
