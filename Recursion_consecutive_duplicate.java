package com.company;

public class Recursion_consecutive_duplicate
{
    public static void main(String[] args)
    {
        String s="aabccba";
        StringBuilder sb = new StringBuilder();
        System.out.println(dup(s,0,sb));
    }
    static String dup(String s,int start,StringBuilder sb)
    {
        if(start==s.length()-1)
        {
            sb.append(s.charAt(start));
            return sb.toString();
        }
        if(s.charAt(start)==s.charAt(start+1))
           return dup(s,start+1,sb);
        else
        {
            sb.append(s.charAt(start));
            return dup(s,start+1,sb);
        }

    }
}
