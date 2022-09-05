package com.company.OOPS.Static;

public class StaticInitialisation
{
    static int a =4;
    static int b;
   static{
       System.out.println("this is from StaticBlock");
       b=a*4;
   }

    public static void main(String[] args) {
        System.out.println(StaticInitialisation.a);
        System.out.println(StaticInitialisation.b);
        StaticInitialisation obj = new StaticInitialisation();
        System.out.println(StaticInitialisation.a + " " + StaticInitialisation.b);
        StaticInitialisation.b+=4;
        System.out.println(StaticInitialisation.a + " " + StaticInitialisation.b);
        StaticInitialisation obj2 = new StaticInitialisation();
        System.out.println(StaticInitialisation.a + " " + StaticInitialisation.b);
    }

}
