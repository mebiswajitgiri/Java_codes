package com.company.maths_DSA;

import java.util.Arrays;

public class SieveOfErtosthenes
{
    public static void main(String[] args) {
        int num=41;
        boolean[] check = new boolean[num+1];
        //System.out.println(Arrays.toString(check));
        sieve(num,check);
    }
    static void sieve(int n,boolean[] check)
    {
        int i=2;
       while(i*i<=n)
       {
           if(!check[i])
           {
               for(int j=2*i;j<=n;j+=i)
               {
                   check[j]=true;
               }
           }
           i++;
       }
        for(int j=2;j<=n;j++)
        {
            if(!check[j])
                System.out.print(j + " ");
       }
    }
}
