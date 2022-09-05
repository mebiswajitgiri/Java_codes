package com.company.Problems;

import java.util.ArrayList;

public class ff
{
    static int sum(int[] arr)
    {
        int sum=0;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            list.add(arr[i]);
        }
        while(list.size()>0)
        {
            int idx = min(list);
            sum=sum+list.get(idx);
            if(list.size()==1)
            {
                list.remove(0);
            }
           else if(idx==0)
            {
                list.remove(0);
                list.remove(0);

            }
            else if(idx==list.size()-1)
            {
                list.remove(list.size()-1);
                list.remove(list.size()-1);
            }
            else
            {
                list.remove(idx);
                list.remove(idx);
                list.remove(idx-1);
            }

        }
        return sum;
    }
    static int min(ArrayList<Integer> list )
    {
        int min=0;
        for(int i=0;i<list.size();i++)
        {
            if(list.get(min)>list.get(i))
            {
                min=i;
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr={7,6,4,9,10,34,56,54};
        System.out.println(sum(arr));

    }
}
