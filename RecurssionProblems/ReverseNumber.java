package com.company.RecurssionProblems;

public class ReverseNumber
{
    //static int sum=0;
//    static void rev(int n)
//    {
//        if(n==0)
//            return;
//        sum=sum*10+(n%10);
//        rev(n/10);
//    }
    static int reverse(int n,int rev)
    {
        if(n==0)
            return rev;
        rev=rev*10+(n%10);
        return reverse(n/10,rev);
    }
    public static void main(String[] args)
    {
        int ans = reverse(23509,0);
        System.out.println(ans);

//        rev(1234);
//        System.out.println(sum);;
//        rev(675);
//        System.out.println(sum);
        System.out.println(palindrome(12321,12321,0));
    }
    static boolean palindrome(int n,int num,int sum)
    {
        if(n==0)
        {
            if(sum==num)
                return true;
            else
                return false;
        }
        sum=sum*10+(n%10);
        return palindrome(n/10,num,sum);
    }

}
