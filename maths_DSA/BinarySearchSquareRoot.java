package com.company.maths_DSA;

public class BinarySearchSquareRoot
{
    public static void main(String[] args)
    {
        int number=56;
        int dec_point=3;
        System.out.println(sqrt(number,dec_point));
    }
    static double sqrt(int num,int d)
    {
        double root=0.0;
        if(num==1 || num==2)
            root= 1;
        if(num<=1)
            return num;
        int s=2,e=num/2;
        while(e-s>=2)
        {
            int mid=s+(e-s)/2;
            if(mid*mid==num)
                return mid;
            else if(mid*mid<num)
                s=mid;
            else
                e=mid-1;
        }
        if(e*e<=num)
            root= e;
        else
            root= s;
        double dec=1;
        for(int j=1;j<=d;j++)
        {
            dec=dec/10;
            while((root+dec)*(root+dec)<= num)
            {
                root=root+dec;
            }
        }
        return root;
    }
}
