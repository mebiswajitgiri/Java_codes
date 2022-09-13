package com.company.AnonymousClass;

import java.util.ArrayList;

public class Q1
{
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,6,7,8};
        System.out.println(methood(arr));
    }
    static ArrayList<Integer> methood(int[] arr)
    {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1;i<=100;i++)
        {
            if(!search(arr,i))
            {
                list.add(i);
            }
        }
        return list;
    }
    static boolean search(int[] arr,int target)
    {
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==target)
                return true;
        }
        return false;
    }
}
