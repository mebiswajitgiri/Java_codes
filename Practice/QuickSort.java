package com.company.Practice;

import java.util.Arrays;

public class QuickSort
{
    public static void main(String[] args)
    {
        int[] arr={10,80,30,90,40,50,70};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
    }
    static void sort(int[] arr,int s,int e)
    {
        if(s>=e)
            return;
        int last_sorted_idx=s-1;
        int pvt = arr[e];
        for(int j=s;j<=e;j++)
        {
            if(arr[j]<=pvt)
            {
                last_sorted_idx++;
                int temp=arr[last_sorted_idx];
                arr[last_sorted_idx]=arr[j];
                arr[j]=temp;
            }
        }
        sort(arr,s,last_sorted_idx-1);
        sort(arr,last_sorted_idx+1,e);
    }
}
