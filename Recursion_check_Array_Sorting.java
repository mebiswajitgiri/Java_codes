package com.company;

public class Recursion_check_Array_Sorting
{
    public static void main(String[] args)
    {
        int[] arr = {1,2,5,5,4,788};
        System.out.println(check(arr,0));

    }
    static boolean check(int[] arr,int s)
    {
        if(arr.length==0)
            return true;
        if(s==arr.length-1)
            return true;
        if(arr[s]<=arr[s+1])
            return check(arr,s+1);
        else
            return false;
    }
}
