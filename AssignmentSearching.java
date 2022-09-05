package com.company;

public class AssignmentSearching {

    public static void main(String[] args) {
        System.out.println(mySqrt(2147395599));

    }
   static int mySqrt(int x)
    {
        if(x==0)
            return x;

        if(x>3)
        {
            int start =1,end=x/2;
            while((end-start)>1)
            {
                int mid=start+(end-start)/2;
                long mul=(long)mid*(long)mid;
                if(mul<x)
                    start = mid;
                if(mul>x)
                    end=mid;
                if(mul==x)
                    return mid;
            }
            if(end-start==1)
            {
                if(end*end<=x)
                    return end;
                if( end*end>x)
                    return start;
            }

        }
        return 1;
    }
}
