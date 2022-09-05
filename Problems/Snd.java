package com.company.Problems;

public class Snd
{
    public static void main(String[] args)
    {
        int[] arr={7,6,4,9,10,34,56,54};
        System.out.println(sum(arr));

    }
    static int sum(int[] arr)
    {
        int sum=0;
        int e=arr.length-1;
        for(int i=0;i<arr.length;i++)
        {
            int idx=min(arr,0,e);
            if(idx==0)
            {
                sum=sum+arr[0];
                swap(arr,0,e-1);
                //swap
            }
            if(idx==e)
            {
                sum=sum+arr[e];
                e=e-2;
            }
            else
            {
                sum=sum+arr[idx];
                swap(arr,idx,e-1);
                swap(arr,idx+1,e);
                swap(arr,idx-1,e-2);
                e=e-3;
            }
        }
        return sum;
    }
    static void swap(int[] arr,int i,int j)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=arr[i];
    }
    static int min(int[] arr,int s,int e)
    {
        int min=s;
        for(int i=s;i<=e;i++)
        {
           if(arr[min]>arr[i])
           {
               min=i;
           }
        }
        return min;
    }
}
