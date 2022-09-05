package com.company;
import java.util.Arrays;
import java.util.Scanner;
public class Sorting
{
    public static void main(String[] args)
    {
        int[] arr = {3,5,2,1,4};
        System.out.println(Arrays.toString(arr));
       // bubble_sort(arr);
        //selection_sort(arr);
       // insertionSort(arr);
        cyclic_Sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr,int fst_idx,int snd_idx)
    {
        int temp = arr[fst_idx];
        arr[fst_idx]=arr[snd_idx];
        arr[snd_idx]=temp;
    }
    // Bubble Sort
   /* static void bubble_sort(int[] arr)
    {
        for(int i=0;i<arr.length-1;i++)
        {
            boolean swapped =false;
            for(int j=1;j<arr.length-i;j++)
            {
                if(arr[j-1]>arr[j])
                {
                    swap(arr,j-1,j);
                    swapped=true;
                }
            }
            if(swapped==false)
                break;
        }
    }*/
    /*static int max_idx(int[] arr,int fst,int snd)
    {
        int max=0;
        for(int i=fst;i<=snd;i++)
        {
           if(arr[max]<arr[i])
           {
               max=i;
           }
        }
        return max;
    }
    static void selection_sort(int[] arr)
    {
        for(int i=0;i<arr.length-1;i++)
        {
            int lst_idx = arr.length-1-i;
           int max_index=max_idx(arr,0,lst_idx);
           swap(arr,max_index,lst_idx);
        }
    }*/

   /* static void insertionSort(int[] arr)
    {
        for(int i=0;i<arr.length-1;i++)
        {
            int j=i+1;
            while(j>0)
            {
                if(arr[j]<arr[j-1])
                {
                    swap(arr,j-1,j);
                    j--;
                }
                else
                    break;
            }
        }
    }*/

    static void cyclic_Sort(int[] arr)
    {
        int i=0;
        while(i<arr.length-1)
        {
            if(arr[i]==i+1)
                i++;
            else
                swap(arr,i,arr[i]-1);
        }
    }

}
