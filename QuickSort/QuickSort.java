package com.company.QuickSort;

import java.util.Arrays;

public class QuickSort
{
    static void sort(int[] arr,int low,int high)
    {
        int p = high;
        int pivot=arr[p];
        for(int i=low;i<=high;i++)
        {
            if(i<p)
            {
               if(arr[i]>arr[p])
               {
                   int temp=arr[i];
                   arr[i]=arr[p];
                   arr[p]=temp;
                   p=i;
               }
            }
           else if(i>p)
            {
                if(arr[i]<arr[p])
                {
                    int temp=arr[i];
                    arr[i]=arr[p];
                    arr[p]=temp;
                    p=i;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr={10,80,30,90,90,50,90};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
