package com.company.maths_DSA;

public class SetBits
{
    public static void main(String[] args) {
        int num=5678;
        System.out.println(Integer.toBinaryString(num));
        System.out.println(setBits(num));
    }
    static int setBits(int num)
    {
        int count=0;
        while(num>0)
        {
            int rightmostbit=num&(-1*num);
            num=num-rightmostbit;
            count++;
        }


        return count;
    }
}
