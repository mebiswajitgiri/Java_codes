package com.company.RecurssionProblems;
import java.util.ArrayList;

public class SearchAllNumbers
{
    static ArrayList<Integer> search(int[] arr,int target)
    {
        ArrayList<Integer> list = new ArrayList<>();
        helper(arr,target,0,list);
        return list;
    }
    public static void main(String[] args)
    {
        int[] arr ={1,26,1,45,90,1,45};
        System.out.println(search(arr,100));
    }
    static void helper(int[] arr,int target,int idx,ArrayList<Integer> list)
    {
        if(idx==arr.length)
            return;
        if(arr[idx]==target)
        {
            list.add(idx);
        }
        helper(arr,target,idx+1,list);
    }
}
