package com.company;

public class Palindrome02_string_leetcode
{
    public static void main(String[] args)
    {
        String s= "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));

    }
    static boolean isPalindrome(String s)
    {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)>='A' && s.charAt(i)<='Z')
                sb.append((char)(s.charAt(i)+(int)('a'-'A')));
            if(s.charAt(i)>='0' && s.charAt(i)<='9')
                sb.append(s.charAt(i));
            if(s.charAt(i)>='a' && s.charAt(i)<='z')
                sb.append(s.charAt(i));
        }
        if(sb==null)
            return false;
        System.out.println(sb);
        return palindrome(sb.toString());

    }
     static boolean palindrome(String s)
    {
        int i=0,j=s.length()-1;
        while(i<=j)
        {
            if(s.charAt(i)==s.charAt(j))
            {
                i++;
                j--;
            }
            else
                return false;
        }
        return true;
    }
}
