package com.company.maths_DSA;

public class ResetPosition
{
    public static void main(String[] args) {
        int num=567;
        int pos=6;

    }
    static void reset(int num,int pos)
    {
        int mask=1<<(pos-1);
        num=num & (~mask);
    }
}
