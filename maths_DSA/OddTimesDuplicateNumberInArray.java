package com.company.maths_DSA;

import java.util.ArrayList;

public class OddTimesDuplicateNumberInArray
{
    public static void main(String[] args) {
        int[] arr = {2,2,3,2,7,7,8,7,8,8};
    }
    static int findNUmber(int[] arr)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        int number =0;
        for(int i=0;i<arr.length;i++)
        {
            int pos=0,bit;
            while(arr[i]>0)
            {
                bit=arr[i]&1;
            }
        }
        return number;
    }
}
