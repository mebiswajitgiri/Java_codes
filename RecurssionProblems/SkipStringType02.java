package com.company.RecurssionProblems;

public class SkipStringType02
{
    public static void main(String[] args)
    {
        String s ="bahdapphdonhapple";
        System.out.println(skip(s,"app","apple"));
    }
    static String skip(String s,String target,String cond)
    {
        if(s.length()==0)
            return "";
        else if(check(s,target) && !check(s,cond))
        {
            return ""+skip(s.substring(target.length()),target,cond);
        }
        else
            return ""+s.charAt(0)+skip(s.substring(1),target,cond);
    }
    static boolean check(String s,String target)
    {
        if(s.length()<target.length())
            return false;
        else if(s.charAt(0)!=target.charAt(0))
            return false;
        else
        {
            for(int i=1;i<target.length()-1;i++)
            {
                if(s.charAt(i)!=target.charAt(i))
                    return false;
            }
            return true;
        }
    }
}
