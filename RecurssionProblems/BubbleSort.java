package com.company.RecurssionProblems;
import java.util.Arrays;
public class BubbleSort
{
    public static void main(String[] args)
    {
        int[] arr={23,12,44,2,90,12,34};
        sort(arr,0,1);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr,int idx,int pass)
    {
        if(pass==arr.length)
        {
            return ;
        }
        if(idx==arr.length-pass)
            sort(arr,0,pass+1);
        else
        {
            if(arr[idx]>arr[idx+1])
                swap(arr,idx);
            sort(arr,idx+1,pass);
        }
    }
    static void swap(int[] arr,int idx)
    {
        int temp=arr[idx];
        arr[idx]=arr[idx+1];
        arr[idx+1]=temp;
    }

}
