package com.company.maths_DSA;

public class PowerOfNumber
{
    public static void main(String[] args) {
        int num=2;
        int pow=10;
        int ans=1,bit,base=num;
        while(pow>0)
        {
            bit=pow&1;
            if(bit==1)
            {
                ans*=base;
                base*=base;
                pow=pow>>1;
            }
            else
            {
                base*=base;
                pow=pow>>1;
            }
        }
        System.out.println(ans);
    }
}
