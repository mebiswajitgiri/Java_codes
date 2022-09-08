package com.company.MergeSort;

import java.util.Arrays;

public class QuickSort
{
    public static void main(String[] args)
    {
        int[] arr ={5,4,3,2,1};
        quickSort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void quickSort(int[] arr,int s,int e)
    {
        int start =s;
        int end =e;
        if(e-s<=0)
        {
            return;
        }
        else
        {
            while(start<=end)
            {
                int m = s+(e-s)/2;
                int pvt = arr[m];
                while(arr[start]<=pvt)
                    start++;
                while(arr[end]>pvt)
                    end--;
                if(start<end)
                {
                    int temp=arr[start];
                    arr[start]=arr[end];
                    arr[end]=temp;
                    start++;
                    end--;
                }
            }
        }
        quickSort(arr,s,end);
        quickSort(arr,start,e);
    }
}
