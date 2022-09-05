package com.company;

public class Recursion_Sum_Of_Digits_Of_Number
{
    public static void main(String[] args)
    {
        int num= 2345;
        //System.out.println(sum(num,0));
        System.out.println(product(2,5,0));
    }
    /*static int sum(int num,int sum)
    {
        if(num==0)
            return sum;
        int r=num%10;
        sum=sum+r;
        num=num/10;
        return sum(num,sum);
    }*/
    static int  product(int x ,int y,int product)
    {
        if(x>y)
        {
            if(y==0)
                return product;
            product=product+x;
            return product(x,y-1,product);
        }
        else
        {
            if(x==0)
                return product;
            product=product+y;
            return product(x-1,y,product);
        }
    }
}
