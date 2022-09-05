package com.company;

public class Recursion_Bubble_sort
{
    public static void main(String[] args)
    {
        int[] arr = {5,1,4};
        pass(arr,arr.length-1);
        //System.out.println(Arrays.toString(arr));
    }
    static void pass(int[] arr, int length)
    {
        if(length==0)
            return;
        swap(arr,0,1,length);
        pass(arr,length-1);
    }
    static void swap(int[] arr,int s,int e,int length)
    {
        if(s==length)
            return;
        if(arr[s]>arr[e])
        {
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
        }
        swap(arr,s+1,e+1,length);
    }
}
