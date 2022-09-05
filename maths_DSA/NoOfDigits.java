package com.company.maths_DSA;

public class NoOfDigits
{
    public static void main(String[] args) {
        int num=34756;
        int base=2;
        System.out.println(digits(num,base));
    }
    static int digits(int num,int base)
    {
        int digits= (int)(Math.log(num)/Math.log(base)) + 1;
        return digits;
    }
}
