package com.company.RecursionSubset;

import java.util.ArrayList;

public class AllSubset
{
    public static void main(String[] args)
    {
        ArrayList<String> list=allSubset("abc","");
        System.out.println(list);
    }
    static ArrayList<String> allSubset(String s, String op)
    {
        ArrayList<String> list = new ArrayList<>();
        if(s.length()==0)
        {
            list.add(op);
            return list;
        }
        ArrayList<String> left = allSubset(s.substring(1),op+s.charAt(0));
        ArrayList<String> right =allSubset(s.substring(1),op);
        for(int i=0;i<left.size();i++)
        {
            list.add(left.get(i));
        }
        for(int i=0;i<right.size();i++)
        {
            list.add(right.get(i));
        }
        return list;
    }

}

