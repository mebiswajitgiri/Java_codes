package com.company.RecurrsionProblems;
import java.util.ArrayList;
import java.util.Arrays;

public class RecursiveLinearSearch
{
    public static void main(String[] args) {
        int[] arr={23,8,12,89,8,100};
        System.out.println(search(arr,10,0));
        ArrayList<Integer> ans = new ArrayList<>();
        System.out.println(Arrays.toString(bothIndex(arr,8,0,ans)));
    }
    public static boolean search(int[] arr,int target,int index)
    {
        if(index==arr.length)
            return false;
        else if(arr[index]==target)
            return true;
        else
            return search(arr,target,index+1);
    }
    public static int[] bothIndex(int[] arr,int target,int index,ArrayList<Integer> ans)
    {
        if(index==arr.length)
        {
            int[] sol = new int[ans.size()];
            for(int i=0;i<sol.length;i++)
            {
                sol[i]=ans.get(i);
            }
            return sol;
        }
        else
        {
            if(arr[index]==target)
                ans.add(index);
            return bothIndex(arr,target,index+1,ans);
        }
    }
}
