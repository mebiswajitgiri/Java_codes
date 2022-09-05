package com.company;

public class BinarySearching
{
    public static void main(String[] args)
    {
        int[] arr = {99,81,66,45,32,12,4,0};
        int target=45;
        System.out.println(orderAgnosticBinarySearch(arr,target));
    }
    /*static int binarySearch (int[] arr,int target)
    {
        int start=0,end=arr.length-1,middle;
        while(start<=end)
        {
            middle=start + (end-start)/2;
            if(arr[middle]<target)
                start=middle+1;
            if(arr[middle]>target)
                end=middle-1;
            if(arr[middle]==target)
                return middle;
        }
        return -1;
    }*/

    static int orderAgnosticBinarySearch (int[] arr,int target)
    {
        int start=0,end=arr.length-1,middle;
        boolean check = arr[start]<arr[end];
        while(start<=end)
        {
            middle=start + (end-start)/2;
            if(arr[middle]==target)
                return middle;
            if(check==true)
            {
                if(arr[middle]<target)
                    start=middle+1;
                if(arr[middle]>target)
                    end=middle-1;
        }
            else
            {
                if(arr[middle]<target)
                    end=middle-1;
                if(arr[middle]>target)
                    start=middle+1;
            }

    }
        return -1;
    }
}
