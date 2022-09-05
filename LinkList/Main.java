package com.company.LinkList;

import java.util.LinkedList;

public class Main
{
    public static void main(String[] args) throws Exception {
//       LL2 list = new LL2();
//       list.insert(9);
//       list.insert(34);
//        list.insert(2);
//        list.insert(8);
//        list.insert(100);
//        list.display();
//        list.size();
//        list.insert(1,0);
//        list.insert(80,3);
//        list.display();
//        list.delete(-8);
//        DL list = new DL();
//        list.insertFirst(1);
//        list.insertFirst(0);
//        list.insertLast(2);
//        list.insertLast(3);
//        list.insertLast(4);
//        list.insertLast(5);
//        list.display();
//        list.size();
//        list.insert(6,3);
//        list.display();
//        list.size();
//        list.displayReverse();
//        list.insertParticular(2,90);
//        list.display();

        CircularLL list = new CircularLL();
        list.insert(34);
        list.insert(44);
        list.insert(54);
        list.insert(64);
        list.insert(74);
        list.display();
        list.size();
        list.insert(0,2);
        list.display();
        list.size();
        list.insert(0,4);
        list.display();
        list.size();
        list.delete(34);
        list.display();
        list.delete(0);
        list.display();
        list.delete(0);
        list.display();

     }
}
