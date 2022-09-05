package com.company.ObjectCloning;

public class Main
{
    public static void main(String[] args) throws CloneNotSupportedException {
        Human h1= new Human(22,"Biswajit");
        Human h2 = new Human(h1);
        Human h3= (Human)(h1.clone());
        System.out.println(h1);
        System.out.println(h3);
    }
}
