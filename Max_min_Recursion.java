package com.company;

import java.util.Scanner;

public class Max_min_Recursion
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Number of element in the array");
        int length = in.nextInt();
        int[] arr = new int[length];
        System.out.println("Enter the array elements");
        for(int i=0;i<length;i++)
        {
            arr[i]=in.nextInt();
        }
       // System.out.printf("max Number is %d",max(arr,Integer.MIN_VALUE,0));
        System.out.printf("min Number is %d",min(arr,Integer.MAX_VALUE,0));
    }
    static int max(int[] arr,int max,int pos)
    {
        if(arr[pos]>max)
            max=arr[pos];
        if(pos==arr.length-1)
            return max;
        return max(arr,max,pos+1);
    }
    static int min(int[] arr,int min,int pos)
    {
        if(arr[pos]<min)
            min=arr[pos];
        if(pos==arr.length-1)
            return min;
        return min(arr,min,pos+1);
    }
}
