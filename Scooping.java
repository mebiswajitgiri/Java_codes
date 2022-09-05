package com.company;

public class Scooping {
   static int b=60;
    public static void main(String[] args) {
        System.out.println(b);
        int b;
        b=90;
        System.out.println(b);
        call();
    }
    static void call(){
        System.out.println(b);
    }

}
