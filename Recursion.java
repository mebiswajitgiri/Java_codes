package com.company;

import java.util.Scanner;

public class Recursion {
    public static void main(String[] args)
    {
        //int ans = fibo(4);
        //System.out.println(ans);
        int[] arr = {23,56,58,60,78,90};
        int target =58;
        //System.out.println(binary_search(arr,target,0,arr.length-1));
        String s = "Biswajit";
        System.out.println(s.substring(8));
        Scanner in = new Scanner(System.in);

    }
    //fibonacci numbers
    /*static int fibo ( int n)
    {
        if(n<2)
            return n;
        return fibo(n-1)+fibo(n-2);
    }*/
    // binary search using recursion
    /*static int binary_search(int[] arr,int target,int start,int end)
    {
        if(start>end)
            return -1;
        int mid = start + (end-start)/2;
        if(arr[mid]==target)
            return mid;
        else if(arr[mid]> target)
            return binary_search(arr,target,start,mid-1);
        else
            return binary_search(arr,target,mid+1,end);
    }*/

}
