package com.company.RecurssionProblems;
import java.util.ArrayList;
public class ReturnListWithoutArgumentsSearch
{
    static ArrayList<Integer>  search(int[] arr,int target,int idx)
    {
        ArrayList<Integer> ans = new ArrayList<>();
        ArrayList<Integer> list;
        if(idx==arr.length)
            return ans;
        if(arr[idx]==target)
            ans.add(idx);
        list=search(arr,target,idx+1);
        for(int i=0;i<list.size();i++)
        {
            ans.add(list.get(i));
        }
        return ans;
    }
    public static void main(String[] args)
    {
        int[] arr={1,26,1,45,90,1,45};
        System.out.println(search(arr,45,0));

    }
}
