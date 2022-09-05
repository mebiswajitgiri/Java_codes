package com.company.Problems;

public class Q2
{
    public static void main(String[] args) {
        System.out.println(SumofSetBitNumbers(4,1));
    }
    static int countsetbits(int n)
    {
        int count=0;
        while(n>0)
        {
            n=n&(n-1);
            count++;
        }
        return count;
    }
    static int SumofSetBitNumbers(int n,int set)
    {
        Double range=Math.pow(2,n);
        int sum=0;
        for(int i=0;i<range;i++)
        {
           if(countsetbits(i)==set)
           {
               sum=sum+i;
           }
        }
        return sum;
    }




    static int Sum(int n,int set)
    {
        if(set==0)
            return (n*(n-1))/2;
        Double range=Math.pow(2,n);
        int sum=0;
        for(int i=0;i<range;i++)
        {
            int count=0;
            while(i>0)
            {
                i=i&(i-1);
                count++;
            }
            if(count==set)
            {
                sum=sum+i;
            }
        }
        return sum;
    }
}
