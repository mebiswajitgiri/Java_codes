package com.company;
import java.util.ArrayList;
import java.util.Arrays;
public class String_StringBuilder
{
    public static void main(String[] args) {
        String a="Biswajit";
        String b = "Biswajit";
        System.out.println(a==b);
        System.out.println(a.equals(b));

        String c = new String("Jeet");
        String d = new String("Jeet");
        System.out.println(c==d);
        System.out.println(c.equals(d));
        System.out.println(a.charAt(3));
        System.out.println(56);
        System.out.println("biswajit");
        System.out.println('b');
        System.out.println(new int[] {23,56,78,89});

        String str = "";
        for(int i=0;i<26;i++)
        {
            str=str + (char)('a'+i);
        }
        System.out.println(str);

        StringBuilder builder = new StringBuilder();
        for(int i=0;i<26;i++)
        {
            builder.append((char)('a'+i));
        }
        builder.toString();
       // System.out.println(builder);
       // System.out.println(builder.charAt(24));
       // System.out.println(builder.delete(6,18));
        String name = "bIswajit";
       // System.out.println(builder.charAt(3));
        //System.out.println(Arrays.toString(name.toCharArray()));
       StringBuilder bo = new StringBuilder(6);
        //bo.setCharAt(4,'B');
       // System.out.println(bo);
        ArrayList<ArrayList<String>> list = new ArrayList<ArrayList<String>>();
        list.add(new ArrayList<String>());
        list.get(0).add("Biswajit");
        list.add(new ArrayList<>());
        list.get(0).add("Giri");
        list.add(new ArrayList<>());
        list.get(0).add("jeet");
        System.out.println(list.get(0).get(2).equals("jeet"));

    }
}
