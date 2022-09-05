package com.company.maths_DSA;

public class XORofNumbers
{
    /*public static void main(String[] args) {
        int range=9;
        if(range%4==0)
            System.out.println(range);
        else if(range%4==1)
            System.out.println(1);
        else if(range%4==2)
            System.out.println(range+1);
        else
            System.out.println(0);
    }*/
    public static void main(String[] args) {
        int a=3;
        int b=9;
        int ans=range(b)^range(a-1);
        System.out.println(ans);
    }
    static int range(int range)
    {
        if(range%4==0)
           return range;
        else if(range%4==1)
            return 1;
        else if(range%4==2)
            return range+1;
        else
            return 0;
    }
}
