package com.company.maths_DSA;

public class FindBitPosition
{
    public static void main(String[] args) {
        int num = 876;
        int pos = 5;
        System.out.println(find_pos(num,pos));
    }
    static int find_pos(int num,int pos)
    {
        return (num&(1<<(pos-1)));
    }
}
