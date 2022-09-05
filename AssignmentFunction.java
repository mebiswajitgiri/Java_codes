
package com.company;
import java.util.Scanner;

public class AssignmentFunction {
/*
public static void main(String[] args)
    {
        System.out.println("Enter Numbers");
         Scanner in = new Scanner (System.in);
         int num1= in.nextInt();
        int num2= in.nextInt();
        int num3= in.nextInt();
        int maximum = max(num1,num2,num3);
        int minimum = min(num1,num2,num3);
        System.out.println("the maximum number is  "+maximum);
        System.out.println("the minimum number is  "+minimum);
    }

    static int max(int num1,int num2,int num3)
    {
        int max= num1;
        if (num1<num2)
            max=num2;
        if (num2<num3 && num3>num1)
            max=num3;
        return max;
    }

    static int min(int num1,int num2,int num3)
    {
        int min= num1;
        if (num1>num2)
            min=num2;
        if (num2>num3 && num3<num1)
            min=num3;
        return min;
    }*//*


    */
/*public static void main (String[] args)
    {
        System.out.println("Enter the number to check whether it is even");
        Scanner in =new Scanner (System.in);
        int num = in.nextInt();
        boolean check = evenodd(num);
        System.out.println(check);
    }

    static boolean evenodd (int num)
    {
        boolean check ;
        if (num%2==0)
            check = true;
        else
            check=false;
        return check;
    }*//*


  */
/*  public static void main(String[] args) {
        System.out.println("Enter your age to check you are eligible or not ");
        Scanner in =new Scanner (System.in);
        int age = in.nextInt();
        vote(age);
    }

    static void vote (int age){
        if (age>=18)
            System.out.println("you are eligible");
        else
            System.out.println("you are not eligible");
    }*//*


   */
/* public static void main(String[] args) {
        System.out.println("Enter two Numbers");
        Scanner in = new Scanner (System.in);
        float num1= in.nextFloat();
        float num2= in.nextFloat();
        double sum = sum(num1,num2);
        double product = product(num1,num2);
        System.out.println("sum =  "+sum);
        System.out.println("product =  "+product);
    }

static double sum(float num1,float num2)
{
    double sum = num1+num2;
    return sum;
}

static double product (float num1,float num2)
{
    double product = num1*num2;
    return product;
}*//*


   */
/* public static void main(String[] args) {
        System.out.println("Enter the radius of the Circle ");
        Scanner in = new Scanner (System.in);
        float rad= in.nextFloat();
        double circum= circum(rad);
        double area= area(rad);
        System.out.println("circumference is  "+circum);
        System.out.println("area is  "+area);
    }

    static double circum(float rad)
    {
        double circum = 4*3.14*rad;
        return circum;
    }

    static double area(float rad)
    {
        double area = 3.14*rad*rad;
        return area;
    }
*//*


    */
/*public static void main(String[] args) {
        System.out.println("Enter the number ");
        Scanner in = new Scanner (System.in);
        int num = in.nextInt();
        prime(num);
    }


    static void prime(int num)
    {
        int c =2,count=0;
        while (c*c<=num)
        {
            if (num%c==0)
               count ++;
            c++;
        }
        if (count==0)
            System.out.println("The Number is Prime");
        else
            System.out.println("The Number is not Prime");
    }
*//*


    */
/*public static void main(String[] args) {
        System.out.println("Enter your mark ");
        Scanner in = new Scanner (System.in);
        int mark = in.nextInt();
        grade(mark);
    }

    static void grade(int mark)
    {
        if(mark>=91 && mark<=100)
            System.out.println("your grade is AA");
        if(mark>=81 && mark<=90)
            System.out.println("your grade is AB");
        if(mark>=71 && mark<=80)
            System.out.println("your grade is BB");
        if(mark>=61 && mark<=70)
            System.out.println("your grade is BC");
        if(mark>=51 && mark<=60)
            System.out.println("your grade is CC");
        if(mark>=41 && mark<=50)
            System.out.println("your grade is DD");
        else
            System.out.println("you FAILED");

    }*//*


    */
/*public static void main(String[] args) {
        System.out.println("Enter the Number ");
        Scanner in = new Scanner (System.in);
        int num = in.nextInt();
        int fact = fact(num);
        System.out.println("Factorial is  "+fact);
    }
    static int fact(int num)
    {
        int fact=1;
        for(int i=2;i<=num;i++)
        {
            fact= fact*i;
        }
        if (num==0 || num ==1)
        fact = 1;
        return fact;

    }*//*


    */
/*public static void main(String[] args) {
        System.out.println("Enter the Number ");
        Scanner in = new Scanner (System.in);
        int num = in.nextInt();
        boolean check = palindrome(num);
        System.out.println("it is  "+check +" that number is a palindrome");
    }
    static boolean palindrome (int num)
    {
        int rev =0;
        int temp=num;
        while (num>0)
        {
            int q=num/10;
            int r=num%10;
             rev=rev*10+r;
             num=q;
        }
        if(rev==temp)
            return true;
        else
            return false;
    }*//*


    */
/*public static void main(String[] args) {
        System.out.println("Enter the Numbers ");
        Scanner in = new Scanner (System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();
        pyth(num1,num2,num3);
    }
    static void pyth(int num1,int num2, int num3)
    {
        int sqr_num1 = num1*num1;
        int sqr_num2 = num1*num1;
        int sqr_num3 = num1*num1;
        if(sqr_num1==sqr_num2+sqr_num3 || sqr_num2==sqr_num1+sqr_num3 || sqr_num3==sqr_num2+sqr_num1 )
        {
            System.out.println("A given Triplet is a pythagorean triplet");
        }
        else
            System.out.println("A given Triplet is not a pythagorean triplet");
    }*/


    /*public static void main(String[] args) {
        System.out.println("Enter the Numbers ");
        Scanner in = new Scanner (System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        System.out.println("Prime numbers are ");
        primecheck(num1,num2);
    }
    static boolean prime(int num)
    {
        int c =2,count=0;
        while (c*c<=num)
        {
            if (num%c==0)
                count ++;
            c++;
        }
        if (count==0)
            return true;
        else
            return false;
    }

    static void primecheck(int num1,int num2)
    {
       for (int i = num1;i<=num2;i++)
       {
           boolean check = prime(i);
           if (check==true)
               System.out.println(i);
       }
    }*/

    /*public static void main(String[] args) {
        System.out.println("Enter N");
        Scanner in = new Scanner (System.in);
        int num= in.nextInt();
        int sum= sum(num);
        System.out.println("The Sum of First N numbers is  "+sum);
    }

    static int sum(int num)
    {
        int sum=0;
        for(int i=1;i<=num;i++)
        {
            sum=sum+i;
        }
        return sum;
    }*/

    public static void main(String[] args)
    {
        Scanner in = new Scanner (System.in);
        System.out.println("Enter the price of product");
        float price = in.nextFloat();
        System.out.println("Enter the commission percentage of products");
        float com = in.nextFloat();
        float commission = commission(price,com);
        System.out.println("commission amount is  "+commission);

    }

    static float commission (float price, float com)
    {
        float commission = (price * com)/100;
        return commission;
    }








}

