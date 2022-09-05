package com.company.MergeSort;

import java.util.Arrays;

public class MergeSort
{
    static int[] merge(int[] arr1,int[] arr2)
    {
        int[] arr= new int[arr1.length+arr2.length];
        int idx1=0,idx2=0,idx=0;
        while(idx1<arr1.length || idx2<arr2.length)
        {
            if(idx1==arr1.length)
            {
                arr[idx]=arr2[idx2];
                idx2++;
            }
            else if(idx2==arr2.length)
            {
                arr[idx]=arr1[idx1];
                idx1++;
            }
            if(idx1<arr1.length && idx2<arr2.length)
            {
                if(arr1[idx1]<=arr2[idx2])
                {
                    arr[idx]=arr1[idx1];
                    idx1++;
                }
                else
                {
                    arr[idx]=arr2[idx2];
                    idx2++;
                }
            }
            idx++;
        }
        return arr;
    }
    static int[] mergeSort(int[] arr)
    {
        if(arr.length==1)
            return arr;
        else
        {
            int mid = arr.length/2;
            int[] left=mergeSort(Arrays.copyOfRange(arr,0, mid));
            int[] right=mergeSort(Arrays.copyOfRange(arr, mid , arr.length));
             return merge(left,right);
        }
    }

    public static void main(String[] args) {
        int[] arr={8,3,4,12,5,6};
        int[] ans=mergeSort(arr);
        System.out.println(Arrays.toString(ans));
    }
}
