package com.company.OOPS.Abstarct;

public class Main
{
    public static void main(String[] args)
    {
        Son son = new Son(23000);
        son.career();


        Daughter daughter = new Daughter(19000);
        daughter.career();

//        Parents p = new Parents(67000);
        Parents p = new Daughter(67);
        Parents.hello();

    }
}
