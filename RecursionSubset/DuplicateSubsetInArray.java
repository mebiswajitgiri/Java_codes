package com.company.RecursionSubset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DuplicateSubsetInArray
{
    public static void main(String[] args)
    {
        int[] arr={1,2,2,3,1,4,2};
        System.out.println(dupRemove(arr));
    }
    static List<List<Integer>>  dupRemove(int[] arr)
    {
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int s=0,e=0;
        for(int i=0;i<arr.length;i++)
        {
            if(i>0 && arr[i]==arr[i-1])
            {
                s=e;
            }
            else
                s = 0;
            e=outer.size();
            for(int j=s;j<e;j++)
            {
                ArrayList<Integer> list = new ArrayList<Integer>();
                for(int k =0;k<outer.get(j).size();k++)
                {
                    list.add(outer.get(j).get(k));
                }
                list.add(arr[i]);
                outer.add(list);
            }
        }
       return outer;
    }
}
