package com.company.ExceptionHandling;

public class main
{
    public static void main(String[] args) {
//       int a =50;
//       int b=0;
//     try
//     {
//         int c=a/b;
//     }
//     catch(Exception e)
//     {
//         System.out.println(e.getMessage());
//     }
        //System.out.println("I am Biswajit");
//     finally
//        {
//            System.out.println("i will always execute");
//
//        }
       try
       {
//           method(46,0);
           String name ="Biswa";
           if(!name.equals("Biswajit"))
           {
               throw new MyException("Name has to be Biswajit");
           }
       }
       catch (ArithmeticException e)
       {
           System.out.println(e.getMessage());
       }
       catch (Exception e)
       {
           System.out.println(e.getMessage());
       }
       finally{
           System.out.println("i will always execute");
       }
    }
    static int  method(int a ,int b) //throws ArithmeticException
    {
        if(b==0)
        {
            throw new ArithmeticException("please do not divide by 0");
        }
        return a/b;
    }
}
