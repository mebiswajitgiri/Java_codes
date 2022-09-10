package com.company.RecurssionProblems;

public class SkipString
{
    public static void main(String[] args)
    {
        String s ="bahdapplehdonhapple";
        System.out.println(skip(s,"apple"));

    }
    static String skip(String s,String target)
    {
        if(s.length()==0)
            return "";
        if(check(s,target))
        {
            return ""+skip(s.substring(target.length()),target);
        }
        return ""+s.charAt(0)+skip(s.substring(1),target);

    }
    static boolean check(String s,String target)
    {
        if(s.length()<target.length())
            return false;
        else if(s.charAt(0)!=target.charAt(0))
        {
            return false;
        }
        else
        {
            for(int i=1;i<target.length()-1;i++)
            {
                if(s.charAt(i)!=target.charAt(i))
                {
                    return false;
                }
            }
            return true;
        }

    }

}
