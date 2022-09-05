package com.company.LamdaExpression;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<10;i++)
        {
            list.add(i+5);
        }
//        System.out.println(list);
//        list.forEach((n) -> System.out.println(n));
        //used for interfaces with
        Consumer<Integer> a = (n) -> System.out.println(n);
        list.forEach(a);
    }

}
