package com.company.c;

import java.util.Arrays;

public class X
{
    public static void main(String[] args) {
        int[] arr={11,7,5,10,46,23,16,8};
        method(arr,3);
        System.out.println(Arrays.toString(arr));
    }
    public static void method(int[] arr,int num)
    {
        sort(arr,num);
        sort2(arr,num);
    }
    public static void sort2(int[] arr,int num)
    {
        int idx = arr.length-1;
        for(int i=num;i<arr.length;i++)
        {
            int min =min(arr,num,idx);
            int temp=arr[min];
            arr[min]=arr[idx];
            arr[idx]=temp;
            idx--;
        }
    }
    public static void sort(int[] arr,int num)
    {
        for(int i=0;i<num-1;i++)
        {
            int max =max(arr,num-i);
            int temp=arr[max];
            arr[max]=arr[num-1-i];
            arr[num-1-i]=temp;
        }
    }
    public static int max(int[]arr,int num)
    {
        int max=0;
        for(int i=0;i<num;i++)
        {
            if(arr[i]>arr[max])
                max=i;
        }
        return max;
    }
    public static int min(int[]arr,int num,int idx)
    {
        int min=num;
        for(int i=num;i<=idx;i++)
        {
            if(arr[i]<arr[min])
                min=i;
        }
        return min;
    }
}
