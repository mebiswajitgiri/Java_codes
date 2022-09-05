package com.company.maths_DSA;

public class NewtonRampsonMethodForSQRT
{
    public static void main(String[] args) {
        int num=40;
        System.out.println(sqrt(num));
    }
    static double sqrt(int n)
    {
        double x=n,root;
        while(true)
        {
            root=0.5*(x+n/x);
            double error;
            if(root>=x)
                error=root-x;
            else
                error=x-root;
            if(error<0.01)
                break;
            x=root;

        }
        return root;
    }
}
