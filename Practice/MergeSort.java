package com.company.Practice;

import java.util.Arrays;

public class MergeSort
{
    public static void main(String[] args)
    {
        int[] arr = {18,1,7,19,40};
        System.out.println(Arrays.toString(mergeSort(arr)));
    }
    static int[] mergeSort(int[] arr)
    {
        if(arr.length==1)
            return arr;
        int m = arr.length/2;
        int[] left=mergeSort(Arrays.copyOfRange(arr,0,m)) ;
        int[] right=mergeSort(Arrays.copyOfRange(arr,m,arr.length));
        return merge(left,right);
    }
    static int[] merge(int[] l ,int[] r)
    {
        int[] ans= new int[l.length+r.length];
        int s1=0,s2=0,idx=0;
        while(s1<l.length && s2<r.length)
        {
            if(l[s1]<=r[s2])
            {
                ans[idx]=l[s1];
                s1++;
            }
            else
            {
                ans[idx]=r[s2];
                s2++;
            }
            idx++;
        }
        if(s1<l.length)
        {
            while(s1<l.length)
            {
                ans[idx]=l[s1];
                s1++;
                idx++;
            }
        }
        else if(s2<r.length)
        {
            while(s2<r.length)
            {
                ans[idx]=r[s2];
                s2++;
                idx++;
            }
        }
        return ans;
    }
}
