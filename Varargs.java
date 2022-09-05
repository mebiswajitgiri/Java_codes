package com.company;


import java.util.Arrays;

public class Varargs {
    public static void main(String[] args) {
      multiple(45,67,445,7890,456,1,34,67);
    }

    static void multiple(int a,int...b)
    {
        System.out.println(Arrays.toString(b));
    }
}
