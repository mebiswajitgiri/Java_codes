package com.company.OOPS.Interface;

public class Car implements Engine,Media,Brake
{
    @Override
    public void brake()
    {
        System.out.println("car Break");

    }
    @Override
    public void start()
    {
        System.out.println("car Started , have petrol engine");

    }

   @Override
    public void stop()
    {
        System.out.println("car Stopped , have petrol engine");
    }

   @Override
    public void acc()
   {
       System.out.println("car accelerated , have petrol engine");
    }

}
