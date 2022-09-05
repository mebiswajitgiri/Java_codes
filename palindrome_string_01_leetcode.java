package com.company;

public class palindrome_string_01_leetcode
{
    public static void main(String[] args)
    {
        String s = "casbbac";
        System.out.println(validPalindrome(s));

    }
    static boolean validPalindrome(String s)
    {
        if(s.length()==1)
            return true;
        int i=0,j=s.length()-1;
        boolean check=true;
        while(i<=j)
        {
            if(s.charAt(i)==s.charAt(j))
            {
                i++;
                j--;
            }
            else
            {
                if(check==true)
                {
                    if((j-1>=i) && (s.charAt(i)==s.charAt(j-1)))
                    {
                        j=j-1;
                        i++;
                        j--;
                        check=false;
                    }
                    else if((i+1<=j) && (s.charAt(i)==s.charAt(j)))
                    {
                        i=i+1;
                        i++;
                        j--;
                        check=false;
                    }
                    else
                        return false;
                }
                else
                    return false;
            }
        }
        return true;
    }
}
