package com.company;
import java.sql.SQLOutput;
import java.util.Scanner;
public class Assignment02 {
    public static void main(String[] args) {
        /*System.out.println("Enter The Number :");
        Scanner input = new Scanner ( System.in);
        int num = input.nextInt();
        if (num%2==0)
        {
            System.out.println(num + " is a Even Number .");
        }
        else
        {
            System.out.println(num + " is a Odd Number .");
        }*/

      /*  System.out.println("Please Enter your Name");
        Scanner input = new Scanner(System.in);
        System.out.println("Hello  "+ input.nextLine() + " , Have a nice day.");*/

       /* System.out.println("Enter Principle Balance,Time ( should be in years ),Interest Rate");
        Scanner input = new Scanner(System.in);
        double p = input.nextDouble();
        int t = input.nextInt();
        float r = input.nextFloat();

        double a = p * ( 1+ r*t);
        System.out.println("Final amount is " + a);*/

        /*System.out.println("TWO NUMBER'S CALCULATOR");
        System.out.println("Enter Two Number and Operation like 2 + 3");
        Scanner input = new Scanner ( System.in);
        float num1 = input.nextFloat();
        char op = input.next().charAt(0);
        float num2= input.nextFloat();
        double result = 0;
        if ( op == '+' )
        {
            result = num1 + num2 ;
        }
        else if (op == '-')
        {
            result = num1-num2;
        }
        else if (op == '*')
        {
            result = num1*num2;
        }
        else if (op == '/')
        {
            result = num1/num2;
        }

        System.out.println("Answer = " + result);*/

        /*System.out.println("Enter the numbers");
        Scanner in = new Scanner(System.in);
        float num1 = in.nextFloat();
        float num2 = in.nextFloat();
        if(num1<num2)
            System.out.println(num2 + " is greater than  "+num1);
        if(num1>num2)
            System.out.println(num1 + " is greater than  "+num2);
        else
            System.out.println("both number are equal");*/

        /*System.out.println("Enter the Amount");
        Scanner in = new Scanner ( System.in);
        float inr = in.nextFloat();
        double usd = inr * 0.013479713 ;
        System.out.println("Amount in USD is  " + usd);*/

       /* System.out.println("Fibonacci Series");
        int a = 0;
        int b = 1;
        int result = 0;
        while (a>=0)
        {
            System.out.println(a);
            result= a+b;
            a=b;
            b=result;
        }*/

       /* System.out.println("Enetr the word");
        Scanner in = new Scanner(System.in);
        String Org = in.next();
        String rev = "";
        int num = Org.length();
        for (int i=num-1;i>=0;i-- )
        {
            rev= rev+ Org.charAt(i);
        }

 System.out.println("reverse word is  "+ rev);
        if (Org.equals(rev))
        {
            System.out.println("word is a palindrome string");
        }
        else
        {
            System.out.println("word is not a palindrome string");
        }*/

        /*System.out.println("Enetr the word");
        Scanner in = new Scanner(System.in);
        String org = in.next();
        int len = org.length();
        int i =len-1,j=0,count=0;
        while ( i>=0&j<=len-1)
        {
            if (org.charAt(i)==org.charAt(j))
            {
                i--;
                j++;
            }
            else
            {
                count++;
                i--;
                j++;
            }
        }
        if(count==0)
        {
            System.out.println("Word is a palindrome");
        }
        else
            System.out.println("Word is not a palindrome");*/
        /*System.out.println("Enter the Number");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int temp = num;
        int q,rem,rev=0;
        while (num>0)
        {
            q=num/10;
            rem = num%10;
            rev = rev*10 + rem;
            num = q;
        }
        if (rev==temp)
            System.out.println(temp + "  is a palindrome");
        else
            System.out.println(temp + "  is not a palindrome");*/

        System.out.println("Enter the Number");
        Scanner in = new Scanner ( System.in);
        int num = in.nextInt();
        int temp=num;
        int temp2=num;
        int i=0,sum=0,pow=1;
        while (num>0)
        {
            num=num/10;
            i++;
        }
        while (temp2>0)
        {
            int  rem= temp2%10;
            int q= temp2/10;
            for(int j=1;j<=i;j++)
            {
                pow=pow*rem;
            }
            sum=sum+pow;
            pow=1;
            temp2=q;
        }
        if(sum==temp)
        {
            System.out.println(temp + "  is a armstrong Number");
        }
        else
            System.out.println(temp + "  is not a armstrong Number");






    }
}
