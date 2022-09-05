package com.company.maths_DSA;

public class GCDbyEUCLIDEANmethod
{
    public static void main(String[] args) {
        int n1=4;
        int n2=6;
        System.out.println(gcd(n1,n2));
        System.out.println(lcm(n1,n2));
    }
    static int gcd(int n1,int n2)
    {
        if(n1==0)
            return n2;
        else
            return gcd(n2%n1,n1);
    }
    static int lcm(int n1,int n2)
    {
        return (n1*n2)/gcd(n1,n2);
    }
}
