package com.company.maths_DSA;

public class RightMostSetBit
{
    public static void main(String[] args) {
        int num=56;
        System.out.println(m1(num));
        System.out.println(m2(num));
    }
    static int m1(int num)
    {
        int i=1,count=1;
        while((num&i)==0)
        {
            i=i<<1;
            count++;
        }
        return count;
    }
    static int m2(int num)
    {
        return num & (num* -1);
    }
}
