package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class AssignmentSorting
{
    public static void main(String[] args)
    {
        int[] arr1 = {809,107,274};
        int[] arr2 = {809,274,107};
        //System.out.println(findContentChildren(arr1,arr2));
        //System.out.println(Arrays.toString(intersection(arr1,arr2)));
        //System.out.println(majorityElement(arr));
        //System.out.println(thirdMax(arr1));
        //System.out.println(arrayPairSum(arr1));
       // System.out.println(Arrays.toString(sortByBits(arr)));
        System.out.println(canBeEqual(arr1,arr2));

    }

   static void swap(int[] arr,int first,int second)
    {
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
 /*
    static int majorityElement(int[] nums)
    {
        for(int i=1;i<nums.length;i++)
        {
            int j =i;
            while(j>0)
            {
                if(nums[j-1]<=nums[j])
                    break;
                else
                {
                    swap(nums,j,j-1);
                    j--;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
        int count=0;
        int maj=(nums.length/2) + 1 ;
        System.out.println(maj);

        for(int k=1;k<nums.length;k++)
        {
            if(nums[k]==nums[k-1])
            {
                count++;
                if(count==maj)
                    return nums[k];
            }
            if(nums[k]!=nums[k-1])
            {
                count =0;
            }

        }
        return -1;
    }*/

    /*static void insertion_sort(int[] arr)
    {
        for(int i=1;i<arr.length;i++)
        {
            int j=i;
            while(j>0)
            {
                if(arr[j]>=arr[j-1])
                    j--;
                else
                {
                    swap(arr,j,j-1);
                    j--;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }*/

   /* static int binary_search(int[] arr,int target,int start)
    {
        int end = arr.length-1;
        while(start<=end)
        {
            int mid = start + (end-start)/2;
            if(arr[mid]==target)
                return mid;
            else if(arr[mid]<target)
                start=mid+1;
            else
                end=mid-1;
        }
        return -1;
    }*/

    /*static int[] intersection(int[] nums1, int[] nums2)
    {
        ArrayList<Integer> list = new ArrayList<> (3);
        insertion_sort(nums1);
        insertion_sort(nums2);
        int start =0;
        if(nums1.length<=nums2.length)
        {
            for(int i=0;i<nums1.length;i++)
            {
                int index = binary_search(nums2,nums1[i],start);
                if(index!=-1)
                {
                    list.add(nums1[i]);
                    start = index;
                }
            }
        }
        else
        {
            for(int i=0;i<nums2.length;i++)
            {
                int index = binary_search(nums1,nums2[i],start);
                if(index!=-1)
                {
                    list.add(nums2[i]);
                    start = index;
                }
            }
        }
        System.out.println(list);
        int index =0;
        while(index<list.size()-1)
        {
            if(list.get(index)==list.get(index+1))
            {
                list.remove(index+1);
            }
            else
                index++;
        }
        System.out.println(list);
        int[] sol = new int[list.size()];
        for(int i=0;i<list.size();i++)
        {
            sol[i]=list.get(i);
        }
        return sol;
    }*/

    /*static int max_index(int[] arr,int index)
    {
        int max=Integer.MIN_VALUE,idx=0;
        for(int i=0;i<=index;i++)
        {
            if(arr[i]>max)
            {
                max=arr[i];
                idx=i;
            }
        }
        return idx;
    }*/

    /*static int thirdMax(int[] nums)
    {
        if(nums.length<3 && nums.length>=2)
            return nums[max_index(nums,nums.length-1)];
        if(nums.length>=3)
        {
            int i=0,end,n_max=0;
            while(i<nums.length)
            {
                end = nums.length-1-i;
                int max_index=max_index(nums,end);
                swap(nums,max_index,end);
                if(n_max>0)
                {
                    if(nums[end+1]!=nums[end])
                        n_max++;
                }
                else if(n_max==0)
                    n_max++;

                if(n_max==3)
                    return nums[end];
                i++;
            }
            if(n_max<3)
                return nums[nums.length-1];
        }

        return nums[0];
    }*/

  /*  static int binary_search(int[] arr,int start,int end,int target)
    {
        while(start<end && start!=end-1)
        {
            int mid = start + (end-start)/2;
            if(arr[mid]==target)
                return mid;
            else if(arr[mid]<target)
                start=mid;
            else
                end=mid-1;
        }
        if(arr[end]<=target)
            return end;
        else
        {
            if(arr[start]<=target)
                return start;
        }
        return -1;
    }*/

    /*static int findContentChildren(int[] g, int[] s)
    {
        insertion_sort(g);
        insertion_sort(s);
        int start=0,end=g.length-1,count=0;
        for(int i=s.length-1;i>=0;i--)
        {
            int index = binary_search(g,start,end,s[i]);
            if(index!=-1)
                count++;
            else if(index!=-1 && index!=0)
                end=index-1;
            else if(index==-1 && index== 0)
                return count;
        }
        return count;
    }*/

    /*static int arrayPairSum(int[] nums)
    {
        insertion_sort(nums);
        int sum=0;
        for(int i=0;i<=nums.length-2;i=i+2)
        {
            sum=sum+i;
        }
        return sum;
    }*/
    /*static int bits(int num)
    {
        int count =0;
        while(num>0)
        {
            if(num%2==1)
                count++;
            num=num/2;
        }
        return count;
    }*/
    /*static void insertion_sort(int[] one,int[] arr)
    {
        int k;
        for(int i=1;i<one.length;i++)
        {
            int j=i;
            while(j>0)
            {
                if(one[j]>one[j-1])
                    break;

               else if(one[j]==one[j-1])
                {
                   k=j;
                   while( k>0 && one[k]==one[k-1])
                   {
                       if(arr[k]<arr[k-1])
                       {
                           swap(arr,k,k-1);
                           k--;
                       }
                       else
                           break;
                   }
                   break;
                }

                else
                {
                    swap(one,j,j-1);
                    swap(arr,j,j-1);
                    j--;
                }
            }
        }
    }*/

    /*static int[] sortByBits(int[] arr)
    {
        int[] one = new int[arr.length];
        for(int i=0;i<arr.length;i++)
        {
            one[i]=bits(arr[i]);
        }
        System.out.println(Arrays.toString(one));
        insertion_sort(one,arr);
        return arr;
    }*/

    static void insertion_sort(int[] arr,int start)
    {
        for(int i=start+1;i<arr.length;i++)
        {
            int j=i;
            while(j>0)
            {
                if(arr[j]>=arr[j-1])
                    break;
                else
                {
                    swap(arr,j,j-1);
                    j--;
                }
            }
        }
    }
    static int binary_search(int[] arr,int target,int start,int end)
    {
        while(start<=end)
        {
            int mid= start +(end-start)/2;
            if(arr[mid]==target)
                return mid;
            else if(arr[mid]<target)
                start=mid+1;
            else
                end=mid-1;
        }
        return -1;
    }
    static void reverse(int[] arr,int start,int end)
    {
        int s=start,e=end;
        while(s<=e)
        {
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;
            s++;
            e--;
        }
    }
    static boolean canBeEqual(int[] target, int[] arr)
    {
        if(target.length==1)
        {
            if(target[0]==arr[0])
                return true;
            else
                return false;
        }
        insertion_sort(arr,0);
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<target.length;i++)
        {
            int idx=binary_search(arr,target[i],i,arr.length-1);
            if(idx==-1)
                return false;
            else if(idx!=i)
            {
                reverse(arr,i,idx);
                //System.out.println(Arrays.toString(arr));
                insertion_sort(arr,i+1);
               // System.out.println(Arrays.toString(arr));
            }
        }
        return true;
    }
}
