package com.company;

import java.util.ArrayList;

public class JumpGame
{
    public static void main(String[] args) {
        String s = "01101001000100";
        int minJump=4;
        int maxJump=7;
        canReach(s,minJump,maxJump);
    }
    static boolean condCheck(int i,int j,int minJump,int maxJump,String s)
    {
        int cond1=i+minJump;
        int cond2;
        if((i+maxJump)>s.length()-1)
            cond2=s.length()-1;
        else
            cond2=i+maxJump;
        if(j>=cond1 && j<=cond2)
            return true;
        else
            return false;
    }
    static boolean search(ArrayList<Integer> list, int target, int s)
    {
        int e=list.get(list.size()-1);
        while(s<=e)
        {
            int mid=s+(e-s)/2;
            if(list.get(mid)==target)
                return true;
            else if(list.get(mid)>target)
                s=mid+1;
            else
                e=mid-1;
        }
        return false;
    }
    static boolean canReach(String s, int minJump, int maxJump)
    {
        if(s.length()==1)
            return true;
        if(s.charAt(s.length()-1)=='1')
            return false;
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int k=1;k<s.length();k++)
        {
            if(s.charAt(k)=='0')
            {
                if(condCheck(0,k,minJump,maxJump,s))
                {
                    if(k==s.length()-1)
                        return true;
                    list.add(k);
                }

            }


        }
        for(int k=0;k<list.size();k++)
        {
            for(int j=list.get(k)+1;j<s.length();j++)
            {
                if(s.charAt(j)=='0')
                {
                    if(condCheck(list.get(k),j,minJump,maxJump,s)==true && search(list,j,k)==false)
                    {
                        if(j==s.length()-1)
                            return true;
                        list.add(j);
                    }
                }
            }
        }
        return false;

    }
}
