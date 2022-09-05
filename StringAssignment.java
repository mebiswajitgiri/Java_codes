package com.company;

public class StringAssignment
{
    public static void main(String[] args) {
        String s = "Biswajit";
        System.out.println(s.charAt(s.length()-1));
        //System.out.println(i);
        int c,d=0;
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
           sb.append(s.charAt(i));
        }
        System.out.println(sb);
        sb.reverse();
        String ss = "10#13#11";
        int x;
        System.out.println(ss);
    }
}
