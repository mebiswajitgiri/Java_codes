package com.company.QuickSort;

import java.util.Arrays;

public class QuickSortKK
{
    public static void main(String[] args) {
        int[] arr ={10,80,90,40,50,70};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr,int l, int h)
    {
        if(l>=h)
            return;
        int s=l;
        int e=h;
        int m = e;
        int pivot = arr[m];
        while(s <= e)
        {
            while(arr[s] < pivot)
            {
                s++;
            }
            while(arr[e] > pivot)
            {
                e--;
            }
            if(s<=e)
            {
                int temp=arr[s];
                arr[s]=arr[e];
                arr[e]=temp;
                s++;
                e--;
            }
        }
        sort(arr,l,e);
        sort(arr,s,h);
    }
}
