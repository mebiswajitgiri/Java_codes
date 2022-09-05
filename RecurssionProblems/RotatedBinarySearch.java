package com.company.RecurssionProblems;

public class RotatedBinarySearch
{
    static int search(int[] arr,int target)
    {
        return helper(arr,target,0,arr.length-1);
    }
   private static int helper(int[] arr,int target,int s,int e)
    {
        if(s>e)
            return -1;
        int mid=s+(e-s)/2;
        if(arr[mid]==target)
            return mid;
        if(arr[s]<=arr[mid])
        {
            if(target>=arr[s] && target<arr[mid])
                return helper(arr,target,s,mid-1);
            else
                return helper(arr,target,mid+1,e);
        }
        else
        {
            if(target>arr[mid] && target<=arr[e])
                return helper(arr,target,mid+1,e);
            else
                return helper(arr,target,s,mid-1);
        }
    }
    public static void main(String[] args)
    {
        int[] arr={4,5,6,7,8,1,2,3};
        System.out.println(search(arr,30));
    }
}
