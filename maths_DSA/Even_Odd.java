package com.company.maths_DSA;

import java.util.Scanner;

public class Even_Odd
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(even_odd(num));
    }
    static String even_odd(int num)
    {
        if((num&1)==1)
            return "ODD";
        else
            return "EVEN";
    }
}
