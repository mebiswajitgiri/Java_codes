package com.company.maths_DSA;

public class SingleElementInArray
{
    public static void main(String[] args) {
        int[] arr = {2,1,3,5,1,2,3};
        System.out.println(xor(arr));
    }
    static int xor(int[] arr)
    {
        int ans=0;
        for(int i=0;i<arr.length;i++)
        {
            ans=ans^arr[i];
        }
        return ans;
    }
}
