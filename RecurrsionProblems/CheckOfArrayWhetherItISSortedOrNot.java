package com.company.RecurrsionProblems;

public class CheckOfArrayWhetherItISSortedOrNot
{
    public static void main(String[] args)  {
        int[] arr ;
        arr=new int[]{1,2,1,4,5,6};
        int pos=0;
        System.out.println(check(arr,0));
    }
    public static boolean check(int[] arr,int pos)
    {
        if(pos==arr.length-1)
            return true;
        else
        {
            if(arr[pos+1]>=arr[pos])
            {
                return check(arr,pos+1);
            }
            else
                return false;
        }

    }
}
