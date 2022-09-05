package com.company;
import java.sql.SQLOutput;
import java.util.Scanner;

public class AssignmentLoops {
    public static void main (String[] args)
    {
        /*System.out.println("Enter the radius");
        Scanner in = new Scanner (System.in);
        float rad = in.nextFloat();
        double area = 3.14 * rad*rad;
        System.out.println("Area of the circle is  " +area);*/

        /*System.out.println ( "Enter the Height and base of the Triangle");
        Scanner in =  new Scanner ( System.in);
        float h = in.nextFloat();
        float b = in.nextFloat();
        double area = 0.5*b*h;
        System.out.println("Area of the triangle is  "+area);*/

        /*System.out.println("Enter the length and breath of the Rectangle");
        Scanner in =  new Scanner ( System.in);
        float l = in.nextFloat();
        float b = in.nextFloat();
        double area = b*l;
        System.out.println("Area of the Rectangle is  "+area);*/

        /*System.out.println("Enter the length of equal sides and base of the Isosceles Triangle");
        Scanner in =  new Scanner ( System.in);
        float a = in.nextFloat();
        float b = in.nextFloat();
        double k = (a*a) - ((b*b)/4);
        if (k>=0)
        {
        double h =Math.sqrt(k);
        double area = 0.5*b*h;
        System.out.println("Area of the Isosceles triangle is  "+area);
       }
       else
        System.out.println("Invalid Entry");*/

        /*System.out.println("Enter the height and base of the Rectangle");
        Scanner in =  new Scanner ( System.in);
        float h = in.nextFloat();
        float b = in.nextFloat();
        double area = b*h;
        System.out.println("Area of the parallelogram is  "+area);*/

        /*System.out.println("Enter the diagonals of the Rhombus");
        Scanner in =  new Scanner ( System.in);
        float d1 = in.nextFloat();
        float d2 = in.nextFloat();
        double area = 0.5*d1*d2;
        System.out.println("Area of the rhombus is  "+area);*/

        /*System.out.println("Enter the side of the Equilateral triangle");
        Scanner in =  new Scanner ( System.in);
        float a = in.nextFloat();
        double area = 0.433*a*a;
        System.out.println("Area of the rhombus is  "+area);*/

        /*System.out.println("Enter the radius of the circle");
        Scanner in =  new Scanner ( System.in);
        float r = in.nextFloat();
        double per = 4*3.14*r;
        System.out.println("Perimeter of the circle is  "+per);*/

        /*System.out.println("Enter the side of the equilateral triangle");
        Scanner in =  new Scanner ( System.in);
        float a = in.nextFloat();
        double per = 3*a;
        System.out.println("Perimeter of the circle is  "+per);*/

        /*System.out.println("Enter the length and breath of the rectangle or parallelogram ");
        Scanner in =  new Scanner ( System.in);
        float l = in.nextFloat();
        float b = in.nextFloat();
        double per = 2*(l+b);
        System.out.println("Perimeter of the circle is  "+per);*/

        /*System.out.println("Enter the side of the Square or rhombus");
        Scanner in =  new Scanner ( System.in);
        float a = in.nextFloat();
        double per = 4*a;
        System.out.println("Perimeter of the circle is  "+per);*/

        /*System.out.println("Enter the length and breath of the rectangle or parallelogram ");
        Scanner in =  new Scanner ( System.in);
        float l = in.nextFloat();
        float b = in.nextFloat();
        double per = 2*(l+b);
        System.out.println("Perimeter of the circle is  "+per);*/

        /*System.out.println("Enter the Radius,height of the cone ");
        Scanner in =  new Scanner ( System.in);
        float r = in.nextFloat();
        float h = in.nextFloat();
        double vol = (3.14*r*r*h)/3;
        System.out.println("volume is  "+vol);*/

        /*System.out.println("Enter the base type of the Prism");
        Scanner in = new Scanner ( System.in);
        String base = in.next();

        switch (base) {
            case "triangular" -> {
                System.out.println("Enter the height and base of triangle and the height of the prism");
                Scanner input = new Scanner(System.in);
                float h1 = input.nextFloat();
                float b = input.nextFloat();
                float h2 = input.nextFloat();
                double vol = 0.5 * h1 * b * h2;
                System.out.println("volume is  " + vol);
            }
            case "rectangular" -> {
                System.out.println("Enter length and breath of base and height of the prism");
                Scanner input = new Scanner(System.in);
                float l = input.nextFloat();
                float b = input.nextFloat();
                float h = input.nextFloat();
                double vol = l * b * h;
                System.out.println("volume is  " + vol);
            }
            case "pentagon" -> {
                System.out.println("Enter the side length of base and height prism");
                Scanner input = new Scanner(System.in);
                float a = input.nextFloat();
                float h = input.nextFloat();
                double area = 1.72048 * a * a;
                double vol = area * h;
                System.out.println("volume is  " + vol);
            }
            case "hexagon" -> {
                System.out.println("Enter the side length of base and height prism");
                Scanner input = new Scanner(System.in);
                float a = input.nextFloat();
                float h = input.nextFloat();
                double area = 2.59808 * a * a;
                double vol = area * h;
                System.out.println("volume is  " + vol);
            }
            default ->
                System.out.println("please enter a valid entry (hexagon,pentagon,rectangular,triangular");
        }
       */

        /*System.out.println("Enter the Radius,height of the cylinder ");
        Scanner in =  new Scanner ( System.in);
        float r = in.nextFloat();
        float h = in.nextFloat();
        double vol = 3.14*r*r*h;
        System.out.println("volume is  "+vol);*/

        /*System.out.println("Enter the Radius of the Sphere ");
        Scanner in =  new Scanner ( System.in);
        float r = in.nextFloat();
        double vol = 4.18879*r*r*r;
        System.out.println("volume is  "+vol);*/

        /*System.out.println("Enter base type of the pyramid");
        Scanner in = new Scanner(System.in);
        String base = in.next();

        switch (base)
        {
            case "triangular"->
                    {
                        System.out.println("Enter the length of base and height of the Triangle and the height of the Pyramid");
                        Scanner input = new Scanner (System.in);
                        float b= input.nextFloat() ;
                        float h= input.nextFloat() ;
                        float H= input.nextFloat() ;
                        double vol = (b*H*h)/6;
                        System.out.println("Volume is  "+vol);
                    }
            case "square"->
                    {
                        System.out.println("Enter side and height of the Pyramid");
                        Scanner input = new Scanner (System.in);
                        float b= input.nextFloat() ;
                        float h= input.nextFloat() ;
                        double vol = (b*b*h)/3;
                        System.out.println("Volume is  "+vol);
                    }
            case "rectangular"->
                    {
                        System.out.println("Enter length and breath of side and height of the Pyramid");
                        Scanner input = new Scanner (System.in);
                        float l= input.nextFloat() ;
                        float b= input.nextFloat() ;
                        float h= input.nextFloat() ;
                        double vol = (l*b*h)/3;
                        System.out.println("Volume is  "+vol);
                    }
            case "pentagonal"->
                    {
                        System.out.println("Enter side length of base and height of the Pyramid");
                        Scanner input = new Scanner (System.in);
                        float a= input.nextFloat() ;
                        float h= input.nextFloat() ;
                        double area =1.72048 * a * a;
                        double vol = (area*h)/3;
                        System.out.println("Volume is  "+vol);
                    }
            case "hexagonal"->
                    {
                        System.out.println("Enter side length of base and height of the Pyramid");
                        Scanner input = new Scanner (System.in);
                        float a= input.nextFloat() ;
                        float h= input.nextFloat() ;
                        double area =2.59808  * a * a;
                        double vol = (area*h)/3;
                        System.out.println("Volume is  "+vol);
                    }
            default -> System.out.println("please enter valid entry (hexagonal,pentagonal,rectangular,square,triangular)");
        }*/

        /*System.out.println("Enter the radius and height of the pyramid");
        Scanner in = new Scanner(System.in);
        float r = in.nextFloat();
        float h = in.nextFloat();
        double s = 6.28*r*h;
        System.out.println("Surface area is  "+s);*/

        /*System.out.println("Enter the side of the cube");
        Scanner in = new Scanner(System.in);
        float a = in.nextFloat();
        double t = 6*a*a;
        System.out.println("Total Surface area is  "+t);*/

       /* System.out.println("Enter the nth term till you want to print");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a=0,b=1;
        for(int i=1;i<=n;i++)
        {
            int c = a+b;
            System.out.println(a);
            a=b;
            b=c;
        }*/

        /*System.out.println("Enter the Number");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int temp = n,sum=0,pro=1;
         while (n>0)
         {
             int q = n/10;
             int r = n%10;
             sum = sum + r;
             pro = pro *r;
             n=q;
         }
         int ques = pro-sum;
        System.out.println("Subtraction of the Product and Sum of Digits of  "+temp+" is  "+ques);*/

        /*System.out.println("Enter the Number");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int root = (int)(Math.sqrt(n));

        for (int i=1;i<=root;i++)
        {
            if (n%i==0)
            {
                int q = n/i;
                System.out.println(i);
                System.out.println(q);
            }
        }*/


        /*System.out.println("Enter the numbers");
        int sum =0;
        int n;
        do {
            Scanner in = new Scanner ( System.in);
            n=in.nextInt();
            sum= sum+n;
        }while(n!=0);
        System.out.println("sum is  "+sum);*/

        /*System.out.println("Enter the numbers");
        int big =0;
        int n;
        do {
            Scanner in = new Scanner ( System.in);
            n=in.nextInt();
            if (big<n)
            {
                big=n;
            }

        }while(n!=0);
        System.out.println("greatest number is  "+big);*/

        /*System.out.println("Enter the number whose factorial is to be calculated");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int fac=1;
        for (int i =1;i<=n;i++)
        {
            fac=fac*i;
        }
        System.out.println("factorial of the  "+n+" is  "+fac);*/

        /*System.out.println("Enter your total unit");
        Scanner in = new Scanner (System.in);
        float unit = in.nextFloat();
        double bill ;
        if (unit<=100)
        {
            bill = 30+2.96+(0.2692*unit);
        }
        else if (unit>100 && unit<=300)
        {
            bill= 50+5.56+ (0.5056*unit);
        }
        else if (unit>300 && unit<=500)
        {
            bill = 50 +9.16+(unit*0.833);
        }
        else
        {
            bill = 100 + 10.01 + (unit * 0.9648);
        }
        System.out.println("your Bill is of amount  " + bill);*/

        /*System.out.println("Enter the number of terms");
        Scanner in = new Scanner(System.in);
        int term = in.nextInt();
        double num =0;
        System.out.println("Enter numbers");
        for(int i=1;i<=term;i++)
        {
            num =num+ in.nextFloat();

        }
        double avg = num/term;
        System.out.println("average is  "+avg);*/


       /* System.out.println("Enter the price of the product");
        Scanner in = new Scanner(System.in);
        float price = in.nextFloat();
        System.out.println("Enter the percentage discount on the product");
        float dis= in.nextFloat();
        double fin = price - (price*dis/100);
        System.out.println("Final price is  "+fin);*/

        /*System.out.println("Enter the co-ordinate of the first point");
        Scanner in = new Scanner(System.in);
        float x1= in.nextFloat();
        float y1= in.nextFloat();
        float z1= in.nextFloat();

        System.out.println("Enter the co-ordinate of the second point");
        float x2= in.nextFloat();
        float y2= in.nextFloat();
        float z2= in.nextFloat();

        double dis = Math.sqrt(((x1-x2)*(x1-x2))+((y1-y2)*(y1-y2))+((z1-z2)*(z1-z2))) ;
        System.out.println("Distance between the points is  "+dis);*/

        /*System.out.println("Enter the  number");
        Scanner in = new Scanner(System.in);
        float num = in.nextFloat();
        System.out.println("to the power of");
        int pow = in.nextInt();
        double ans =1;
        for(int i =0;i<pow;i++)
        {
             ans = ans*num;
        }
        System.out.println("Answer is  "+ans);*/

    }
}
