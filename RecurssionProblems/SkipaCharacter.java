package com.company.RecurssionProblems;

public class SkipaCharacter
{
    public static void main(String[] args)
    {
        String input = "baccacd";
       // String ans=new String();
        System.out.println( sol1(input,"",'a'));
        System.out.println( sol2(input,'a'));

    }
    static String sol1(String input,String ans,char target)
    {
        if(input.isEmpty())
        {
            return "";
        }
        char ch = input.charAt(0);
        if(ch==target)
        {
            return ans=ans+sol1(input.substring(1),ans,target);
        }
        else
        {
           return  ans=ans+ch+sol1(input.substring(1),ans,target);
        }
    }
    static String sol2(String input,char target)
    {
        if(input.isEmpty())
            return "";
        char ch = input.charAt(0);
        if(ch==target)
        {
            return ""+sol2(input.substring(1),target);
        }
        else
        {
            return ""+ch+sol2(input.substring(1),target);
        }
    }
}
