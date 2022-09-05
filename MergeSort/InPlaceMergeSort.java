package com.company.MergeSort;

import java.util.Arrays;

public class InPlaceMergeSort
{
    private static void merge(int[] arr,int s1,int e1,int s2,int e2)
    {
        int idx1=s1;
        int idx2=s2;
        //int idx=s1;
        while(idx1<=e1 && idx2<=e2)
        {
            if(arr[idx1]>arr[idx2])
            {
                int temp=arr[idx2];
                for(int i=idx2-1;i>=idx1;i--)
                {
                    arr[i+1]=arr[i];
                }
                arr[idx1]=temp;
                idx1++;
                idx2++;
            }
            else
            {
                idx1++;
            }
        }
        if(idx1==e1+1 && idx2<e2)
        {
            idx2=s2;
            while(idx2<e2)
            {
                if(arr[idx2]>arr[idx2+1])
                {
                    int temp=arr[idx2];
                    arr[idx2]=arr[idx2+1];
                    arr[idx2+1]=temp;
                }
                idx2++;
            }
        }

    }
    private static void merge(int[] arr,int s,int mid,int e)
    {
        int[] mix = new int[e-s+1];
        int idx1=s;
        int idx2=mid+1;
        int idx=0;
        while(idx1<=mid && idx2<=e)
        {
            if(arr[idx1]>arr[idx2])
            {
                mix[idx]=arr[idx2];
                idx2++;
            }
            else
            {
                mix[idx]=arr[idx1];
                idx1++;
            }
            idx++;
        }
        if(idx1==mid+1 && idx2<=e)
        {
            while(idx2<=e)
            {
                mix[idx]=arr[idx2];
                idx2++;
                idx++;
            }
        }
        else if(idx2==e+1 && idx1<=mid)
        {
            while(idx1<=mid)
            {
                mix[idx]=arr[idx1];
                idx1++;
                idx++;
            }
        }
        for(int i=0;i<mix.length;i++)
        {
            arr[s+i]=mix[i];
        }

    }
    static void mergeSort(int[]arr,int s,int e)
    {
        if(s==e)
            return;
        int mid = s+(e-s)/2;
        mergeSort(arr,s,mid);
        mergeSort(arr,mid+1,e);
        merge(arr,s,mid,e);
    }

    public static void main(String[] args) {
        int[] arr ={8,3,4,12,5,6};
        mergeSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
