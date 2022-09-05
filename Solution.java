package com.company;

import java.util.Scanner;

public class Solution  {
    public static void main (String[] args)
    {
        System.out.println("Enter the Number");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int temp = n,sum=0,pro=1;
        while (n>0)
        {
            int q = n/10;
            int r = n%10;
            sum = sum + r;
            pro = pro *r;
            n=q;
        }
        int ques = pro-sum;
        System.out.println("Subtraction of the Product and Sum of Digits of  "+temp+" is  "+ques);
    }
}