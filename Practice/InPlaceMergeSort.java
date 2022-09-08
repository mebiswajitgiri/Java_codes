package com.company.Practice;

import java.util.Arrays;

public class InPlaceMergeSort
{
    public static void main(String[] args)
    {
        int[] arr = {1,1,1,2,1,1,1};
        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
    static  void mergeSort(int[] arr,int s,int e)
    {
        if(e-s==0)
            return;
        int m = s+(e-s)/2;
        mergeSort(arr,s,m);
        mergeSort(arr,m+1,e);
        merge(arr,s,m,e);
    }
    static void merge(int[] arr, int s,int m,int e)
    {
        int s2=m+1;
        if(arr[m]<=arr[m+1])
        {
            return;
        }
        else
        {
            while(s<=m && s2<=e)
            {
                if(arr[s]<=arr[s2])
                {
                    s++;
                }
                else
                {
                    int temp =arr[s2];
                    for(int i=s2-1;i>=s;i--)
                    {
                        arr[i+1]=arr[i];
                    }
                    arr[s]=temp;
                    s++;
                    m++;
                    s2++;
                }
            }
        }

    }
}
