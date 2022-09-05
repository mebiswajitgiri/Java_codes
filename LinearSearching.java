package com.company;

import java.util.ArrayList;
import java.util.Arrays;

public class LinearSearching
{
    /*public static void main(String[] args) {
        String arr = "biswajit";
        char target = 'b';
        System.out.println(linearSearch(arr,target));
    }*/
    /*static int linearSearch (int[] arr,int target)
    {
        if(arr.length==0)
            return -1;
        for (int i=0;i<arr.length;i++)
        {
            if (arr[i]==target)
                return i;
        }
        return -1;
    }*/

   /* static int linearSearch (int[] arr,int target)
    {
        if (arr.length==0)
            return Integer.MAX_VALUE;
        for(int element:arr)
        {
            if (element==target)
                return element;
        }
        return Integer.MAX_VALUE;
    }*/

    /*static Boolean linearSearch (int[] arr,int target)
    {
        if (arr.length==0)
            return false;
        for(int element:arr)
        {
            if (element==target)
                return true;
        }
        return false;
    }*/

    /*static boolean linearSearch (String arr,char target)
    {
        if (arr.length()==0)
            return false;
        for (int i=0;i<arr.length();i++)
        {
           if(arr.charAt(i)==target)
               return true;
        }
        return false;
    }*/

   /* static boolean linearSearch ( String arr,char target)
    {
        if (arr.length()==0)
            return false;
        for(char ch : arr.toCharArray())
        {
            if (ch==target)
            return true;
        }
        return false;
    }*/


    // Search in a Range

    /*public static void main(String[] args) {
        int[] arr = {34,89,34,22,56,11,9} ;
        int target =89;
        int start = 2;
        int end = 5;
        System.out.println(linearSearch_Range(arr,target,start,end));
    }
    static boolean linearSearch_Range (int[] arr,int target,int start,int end)
    {
        if (arr.length==0)
            return false;
        for (int index=start;index<=end;index++)
        {
            if (arr[index]==target)
                return true;
        }
        return false;
    }*/

   /* public static void main(String[] args) {
        int[] arr ={4,78,17,13,56,100};
        System.out.println(min(arr));
    }

    static int min(int[] arr)
    {
        if (arr.length==0)
            return Integer.MAX_VALUE;
        int min = arr[0];
        for (int i=1;i<arr.length;i++)
        {
            if (arr[i]<min)
            {
                min=arr[i];
            }
        }
        return min;
    }*/

    /*public static void main(String[] args)
    {
        int[][] logs =  {{1993,1999},{2000,2010}};
            int[][] pop = new int[logs.length][2];
            for(int i=0;i<logs.length;i++)
            {
                int count=0;
                pop[i][0]=logs[i][0];
                for(int j=0;j<logs.length;j++)
                {
                    if(logs[j][0]<=logs[i][0] && logs[j][1]>logs[i][0])
                        count++;
                }
                pop[i][1]=count;
            }
        for (int i=0;i<pop.length;i++)
        {
            System.out.println(Arrays.toString(pop[i]));
        }
            int max=pop[0][1];
            for(int i=0;i<pop.length;i++)
            {
                if(max<pop[i][1])
                    max=pop[i][1];
            }
        System.out.println(max);
            int min=Integer.MAX_VALUE;
            for(int i=0;i<pop.length;i++)
            {
                if(max==pop[i][1])
                {
                    if(min>pop[i][0])
                        min=pop[i][0];
                }

            }
        System.out.println(min);


        }*/

    public static void main(String[] args) {
      int[][]  matrix = {{3,7,8},{9,11,13},{15,16,17}};
        System.out.println(luckyNumbers(matrix));
    }
    static ArrayList<Integer> luckyNumbers (int[][] matrix)
    {
        ArrayList<Integer> sol = new ArrayList<>(3);
        for(int row=0;row<matrix.length;row++)
        {
            boolean check=true;
            int min= matrix[row][0],column=0,col_number=0;
            for(int col=0;col<matrix[row].length;col++)
            {
                if(min>matrix[row][col])
                {
                    min=matrix[row][col];
                    column=col;

                }
            }
            System.out.println(min );
            System.out.println(col_number);
            System.out.println(check);
            System.out.println(column);
            while(col_number<matrix.length && check==true)
            {
                if(min>=matrix[col_number][column])
                {
                    col_number++;
                }
                else
                    check = false;
            }
            if( col_number== matrix.length && check==true )
                sol.add(min);
        }
        return sol;
    }


}
