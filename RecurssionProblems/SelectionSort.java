package com.company.RecurssionProblems;
import java.util.Arrays;
public class SelectionSort
{
    static void sort(int[] arr,int idx,int pass,int max)
    {
        if(pass==arr.length)
            return;
        if(idx==arr.length-pass)
        {
            swap(arr,max,arr.length-pass);
            sort(arr,0,pass+1,0);
        }
        // max element will be found here
        else
        {
            if(arr[max]<arr[idx])
                max=idx;
            sort(arr,idx+1,pass,max);
        }
    }
    static void swap(int[] arr,int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args)
    {
       int[] arr={2,3,4,1};
       sort(arr,0,1,0);
        System.out.println(Arrays.toString(arr));
    }
}
