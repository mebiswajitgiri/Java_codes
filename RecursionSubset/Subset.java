package com.company.RecursionSubset;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Subset
{
    public static void main(String[] args)
    {
        int[] arr = {1,2,3};
        System.out.println(subset(arr));

    }
    static List<List<Integer>> subset(int[] arr)
    {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        for(int num : arr)
        {
            int n= outer.size();
            for(int i=0;i<n;i++)
            {
                //ArrayList<Integer> list = new ArrayList<>(outer.get(i));
                ArrayList<Integer> list = new ArrayList<>();
                for(int x : outer.get(i))
                {
                    list.add(x);
                }
                list.add(num);
                outer.add(list);
            }
        }
        return outer;
    }
}
