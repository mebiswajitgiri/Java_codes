package com.company;

public class First_Uppercase_recursion
{
    public static void main(String[] args)
    {
       // System.out.println(uppercase("bisWajit",0));
        uppercase("bisWajit",0);
    }
    static char uppercase(String s,int pos)
    {
        if(s.charAt(pos)>='A' && s.charAt(pos)<='Z')
            return s.charAt(pos);
        return uppercase(s,pos+1);
    }
}
