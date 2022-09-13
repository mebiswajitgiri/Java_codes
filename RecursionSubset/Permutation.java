package com.company.RecursionSubset;
import java.util.ArrayList;
public class Permutation
{
    public static void main(String[] args)
    {
        String s="abc";
        System.out.println(per(s,""));
        System.out.println(perCount(s,""));
    }
    static void permutation(String s,String ans)
    {
        if(s.length()==0)
        {
            System.out.println(ans);
            return;
        }
        int n = ans.length();
        for(int i=0;i<=n;i++)
        {
            String temp=ans.substring(0,i)+s.charAt(0)+ans.substring(i);
            permutation(s.substring(1),temp);
        }

    }
    static ArrayList<String> per(String s,String ans)
    {
        ArrayList<String> list = new ArrayList<>();
        if(s.isEmpty())
        {
            list.add(ans);
            return list ;
        }
        int n = ans.length();
        for(int i=0;i<=n;i++)
        {
            String temp = ans.substring(0,i)+s.charAt(0)+ans.substring(i);
            ArrayList<String> l = per(s.substring(1),temp);
            for(int j=0;j<l.size();j++)
            {
                list.add(l.get(j));
            }
        }
        return list;
    }
    static int perCount(String s,String ans)
    {
        int count=0;
        if (s.isEmpty())
        {
            count++;
            return count;
        }

        int n = ans.length();
        for(int i=0;i<=n;i++)
        {
            String temp = ans.substring(0,i)+s.charAt(0)+ans.substring(i);
            count=count+perCount(s.substring(1),temp);
        }
        return count;
    }
}
