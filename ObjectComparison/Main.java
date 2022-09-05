package com.company.ObjectComparison;

import java.util.Arrays;
import java.util.Comparator;

public class Main
{
    public static void main(String[] args) {
        Student s1 = new Student(34,78.12f);
        Student s2 = new Student(35,95.72f);
        Student s3 = new Student(36,60.52f);
        Student s4 = new Student(37,85.72f);
        Student s5 = new Student(38,95.52f);
//        if(s1.compareTo(s2)<0)
//            System.out.println("s1 < s2");
//        else if(s1.compareTo(s2)>0)
//            System.out.println("s1 > s2");
//        else
//            System.out.println("s1==s2");
        Student[] array = {s1, s2, s3, s4, s5};
        System.out.println(Arrays.toString(array));
        Arrays.sort(array, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return 0;
            }
        });
        System.out.println(Arrays.toString(array));

    }
}
