package com.company;

import java.util.Arrays;

public class Recursion_Insertion_Sort
{
    public static void main(String[] args)
    {
        int[] arr= {5,1,4,2};
        pass(arr,1);
        //System.out.println(Arrays.toString(arr));
    }
    static void pass (int[] arr,int length)
    {
        if(length==arr.length)
            return;
        swap(arr,length);
        pass(arr,length+1);
    }
    static void swap(int[] arr,int s)
    {
        if(s==0)
            return;
        if(arr[s]>=arr[s-1])
            return;
        int temp;
        if(arr[s]<arr[s-1])
        {
            temp=arr[s];
            arr[s]=arr[s-1];
            arr[s-1]=temp;
        }
        swap(arr,s-1);
    }
}
