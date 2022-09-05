package com.company.RecurssionProblems;

public class LinearSearch
{
    public static void main(String[] args)
    {
        int[] arr={9,2,3,8,10,1,11};
        System.out.println(search(arr,8));
        find(arr,8,0);
    }
    static int search(int[] arr,int target)
    {
        return helper(arr,target,0);
    }
    private static int helper(int[] arr,int target,int idx)
    {
        if(idx==arr.length)
            return -1;
        if(arr[idx]==target)
            return idx;
        return helper(arr,target,idx+1);
    }
    private static boolean find(int[] arr,int target,int idx)
    {
        if(idx==arr.length)
            return false;
        return arr[idx]==target || find(arr,target,idx+1);
    }
    private static int  findLast(int[] arr,int target,int idx)
    {
        if(idx==-1)
            return -1;
        if(arr[idx]==target)
            return idx;
        return findLast(arr,target,idx--);
    }

}
