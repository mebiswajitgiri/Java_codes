package com.company.OOPS.Class_Object_Final_This_Constructor;

public class Class_Object_this_final_constructor_finalizer
{
    public static void main(String[] args)
        {
            Student s1 = new Student();
            Student s2 = new Student(23,"biswajit",87.16f);

//            s2.name="Biswajit";
//            s2.mark=56.78f;
//            s2.rNo=1;

//            System.out.println(s2.rNo);
//            System.out.println(s2.mark);
//            System.out.println(s2.name);

//            System.out.println(s1.rNo);
//            System.out.println(s1.mark);
//            System.out.println(s1.name);
            //s1.changeName("Biswajit");
            //s1.greeeting();
            int n =10;
            Integer m = 78;
            System.out.println(m);
            n=m;
            System.out.println(n);
            final int p = 10;
            Student s3 = new Student(10,"Babu",99f);
            s3.name="jeet";
            for(int i=0;i<1000000;i++)
            {
                Student s4 = new Student();
                s3=s4;
            }
        }


}
class Student
{
    int rNo;
    float mark;
    String name;
    void changeName(String name)
    {
        this.name=name;
    }
    void greeeting()
    {
        System.out.println("Hello " + this.name + ", you just learn this,constructor,class and object.");
    }
    Student()
    {
        this(0,"no Name",0.0f);
    }
    Student(int rNo,String name,float mark)
    {
        this.rNo=rNo;
        this.name=name;
        this.mark=mark;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }
}
