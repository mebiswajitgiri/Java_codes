package com.company.OOPS.Interface;

public class PetrolCar implements Engine
{
    public void start()
    {
        System.out.println("petrol engine started");
    }

    @Override
    public void stop() {
        System.out.println("petrol engine stopped");
    }

    @Override
    public void acc()
    {
        System.out.println("petrol engine accelerated");

    }
}
