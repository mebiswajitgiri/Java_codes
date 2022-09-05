package com.company;

public class Recursion_balanced_parenthesis
{
    public static void main(String[] args)
    {
        String str = "([)]";
        //System.out.println(check(str));
        System.out.println(isValid(str));
    }
    static int search(String s,char target,boolean[] check)
    {
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==target && check[i]==false)
                return i;
        }
        return -1;
    }
   static boolean isValid(String s)
    {
        if(s.length()==1)
            return false;
        boolean[] check= new boolean[s.length()];
        for(int i=0;i<check.length;i++)
            check[i]=false;
        int idx=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
                idx=search(s,')',check);
            else if(s.charAt(i)=='{')
                idx=search(s,'}',check);
            else if(s.charAt(i)=='[')
                idx=search(s,']',check);
            else
            {
                if(check[i]==false)
                    return false;
            }
            if(idx!=-1)
                check[idx]=true;
            else
                return false;

            check[i]=true;

        }
        return true;
    }
    /*static boolean check(String str)
    {
        if(str.charAt(0)==']' || str.charAt(0)=='}' || str.charAt(0)==')' )
            return false;
        if(str.charAt(0)=='[')
            return search(str,1,']');
        if(str.charAt(0)=='{')
            return search(str,1,'}');
        else
            return search(str,1,')');
    }
    static boolean search(String str,int s,char target)
    {
        if(s==str.length()-1)
            return false;
        if(str.charAt(s)==target)
        {
            if(str.charAt(s+1)==']' || str.charAt(s+1)==')' || str.charAt(s+1)=='}')
                return false;
            if(str.charAt(s+1)=='[')
                return search(str,s+2,']');
            if(str.charAt(s+1)=='{')
                return search(str,s+2,'}');
            else
                return search(str,s+2,')');
        }
        if(str.charAt(s)=='}' && target!='}')
            return false;
        if(str.charAt(s)==']' && target!=']')
            return false;
        if(str.charAt(s)==')' && target!=')')
            return false;
        if(str.charAt(s)=='{')
            return search(str,s+1,'}');
        if(str.charAt(s)=='[')
            return search(str,s+1,']');
        else
            return search(str,s+1,')');
    }*/

}
