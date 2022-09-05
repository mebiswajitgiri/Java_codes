/*
package com.company;

import java.util.ArrayList;

public class Recursion_Palindrome_substring
{
    public static void main(String[] args)
    {

    }
    static  boolean palindrome(String s,int start,int end)
    {
        if(start>end)
            return true;
        if(s.charAt(start)==s.charAt(end))
            return palindrome(s,start+1,end-1);
        else
            return false;
    }
    ArrayList<ArrayList<String>> list = new ArrayList<ArrayList<String>>();

    static ArrayList<ArrayList<String>> process(String s,ArrayList<ArrayList<String>> list,int pos)
    {
      if(pos==s.length())
          return list;
      if(palindrome(s.substring(0,pos),0,s.substring(0,pos).length()-1))
      {
          list.add(
      }
    }
}
*/
