package com.company.RecurssionProblems;

public class ArraySortedOrNot
{
    static boolean sortedOrNot(int[] arr)
    {
        if(arr.length==1)
            return true;
        return helper(arr,0);
    }
    private static boolean helper(int[] arr,int pos)
    {
        if(pos==arr.length-1)
            return true;
        if(arr[pos]<arr[pos+1])
            return helper(arr,pos+1);
        return false;
    }
    public static void main(String[] args)
    {
        int[] arr ={1,2,3,4,5,6};
        System.out.println(sortedOrNot(arr));

    }
}
