package com.company.LearnJava;

public class ParseInteger
{
    private char[]  charnum= {'0','1','2','3','4','5','6','7','8','9'};
    private  int ans=0;
    public int parInteger(String s)
    {

        for(int i=0;i<s.length();i++)
        {
            ans=ans*10 + (Search(s.charAt(i)));
        }
        return ans;
    }
    private  int Search(char target)
    {
        for(int i=0;i<charnum.length;i++)
        {
            if(charnum[i]==target)
                return i;
        }
        return -1;
    }
}
