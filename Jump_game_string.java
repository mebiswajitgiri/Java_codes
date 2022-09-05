package com.company;

public class Jump_game_string
{
    public static void main(String[] args)
    {
        String s="011010";
        int minJump=2,maxJump=3;
        System.out.println(canReach(s,minJump,maxJump));

    }
    static int search(String s,int start)
    {
        for(int i=start;i<s.length();i++)
        {
            if(s.charAt(i)==0)
                return i;
        }
        return -1;
    }
    static boolean canReach(String s, int minJump, int maxJump)
    {
        if(s.length()==1)
            return true;
        if(s.charAt(s.length()-1)=='1')
            return false;
        int i=1,zero=0;
        while(i<s.length())
        {
            int idx=search(s,i);
            if(idx==-1)
                break;
            int con1=zero+minJump,con2;
            if(zero+maxJump<=s.length()-1)
                con2=zero+maxJump;
            else
                con2=s.length()-1;
            if(idx>=con1 && idx<=con2)
            {
                zero=idx;
            }
            i=idx+1;
        }
        if(zero==s.length()-1)
            return true;
        else
            return false;
    }
}

