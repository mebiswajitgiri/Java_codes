package com.company.Practice;

import java.util.Scanner;

public class Code1
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum=0;
        while(true)
        {
            if(in.nextInt()==0)
            {
                break;
            }
            else
            {
                sum=sum+in.nextInt();
            }
        }
        System.out.println("Sum is "+sum);
    }
}
