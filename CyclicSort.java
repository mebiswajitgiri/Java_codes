package com.company;

import java.util.Arrays;

public class CyclicSort
{
    public static void main(String[] args) {
        int[] arr = {7,8,9,11,12};
        //int[] ans = findErrorNums(arr);
        System.out.println(firstMissingPositive(arr));
    }
    static void swap (int[] arr,int first,int second)
    {
        int temp=arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }

    /*static int[] findErrorNums(int[] nums)
    {
        int i=0;
        int[] ans = new int[2];
        while(i<nums.length)
        {
            if(nums[i]== i+1)
                i++;
            else
            {
                if(nums[nums[i]-1]==nums[i])
                    i++;
                else
                    swap(nums,i,nums[i]-1);
            }
        }
        for(int idx =0;idx<nums.length;i++)
        {
            if(nums[idx]!=idx+1)
            {
                ans[0]=nums[idx];
                ans[1]=idx;
            }

        }

        return ans;

    }*/

    static int firstMissingPositive(int[] nums)
    {
        int i=0;
        while(i<nums.length)
        {
            if(nums[i]==i+1)
                i++;
            else
            {
                if(nums[i]<=0 || nums[nums[i]-1]==nums[i] || nums[i]>nums.length)
                    i++;
                else
                    swap(nums,i,nums[i]-1);
            }
        }
        for(int idx=0;idx<nums.length;idx++)
        {
            if(nums[idx]!=idx+1)
                return idx+1;
        }
        return nums.length+1;
    }


}
