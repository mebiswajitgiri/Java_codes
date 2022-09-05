package com.company;

import java.util.Arrays;

public class BinarySearchInMatrix
{
    //BINARY SEARCH IN A MATRIX WHEN MATRIX IS SORTED


    /*public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };

        int target = 2;
        System.out.println(Arrays.toString(matrixBinarySearch(arr,target)));
    }

    static int[] matrixBinarySearch ( int[][] arr, int target)
    {
        if(arr.length==0)
            return new int[] {-1,-1};
        int row_start =0,row_end=arr.length-1,col_start=0,col_end=arr[0].length-1;

        int mid_col = col_start+ (col_end - col_start)/2 ;
        while((row_end-row_start)>1)
        {
            int mid_row = row_start+ (row_end - row_start)/2 ;
            if(arr[mid_row][mid_col]==target)
                return new int[] {mid_row,mid_col} ;
            else if(arr[mid_row][mid_col]>target)
                row_end=mid_row;
            else
                row_start=mid_row;
        }

        int mid_row = row_start+ (row_end - row_start)/2 ;

        while((col_end-col_start)>1)
        {
            mid_col = col_start+ (col_end - col_start)/2 ;
            if(arr[mid_row][mid_col]==target)
                return new int[] {mid_row,mid_col} ;
            else if(arr[mid_row][mid_col]>target)
                col_end=mid_col;
            else
                col_start=mid_col;
        }
        for(int i=row_start;i<=row_end;i++)
        {
            for(int j= col_start;j<=col_end;j++)
            {
                if(arr[i][j] == target )
                    return new int[] {i,j};
            }
        }
        return new int[] {-1,-1};
    }*/


    // Binary Search in 2D ARRAY WHEN MATRIX IS SORTED ROW AND COLUMN -WISE

    /*public static void main(String[] args)
    {
       int[][] arr = {
               {10,20,30,40},
               {16,23,35,41},
               {26,29,45,49},
               {38,46,58,88}} ;
       int target = 99;
        System.out.println(Arrays.toString(matrixBinarySearch(arr,target)));
    }

    static int[] matrixBinarySearch (int[][] arr,int target)
    {
        int[] sol = new int[2];
        int row=0,col=arr[row].length-1;
        while(row<arr.length && col>=0)
        {
            if(target==arr[row][col])
                return new int[]  {row,col};
            if(target<arr[row][col])
                col--;
            if(target > arr[row][col])
                row++;
        }
        return new int[] {-1,-1};
    }
*/
}
