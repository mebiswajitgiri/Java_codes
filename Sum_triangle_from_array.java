package com.company;

import java.util.Arrays;

public class Sum_triangle_from_array
{
    public static void main(String[] args) {
      int[] arr = {1,2,3,4,5};
      triangle(arr);
    }
    static void triangle(int[] arr)
    {
        if(arr.length==1)
        {
            System.out.println(Arrays.toString(arr));
            return;
        }
        int[] new_arr = new int[arr.length-1];
        for(int i=0;i<new_arr.length;i++)
        {
            new_arr[i]=arr[i]+arr[i+1];
        }
        triangle(new_arr);
        System.out.println(Arrays.toString(arr));
    }
}
