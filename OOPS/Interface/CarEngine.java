package com.company.OOPS.Interface;

public class CarEngine implements Engine
{
    public void start()
    {
        System.out.println("Engine Started");
    }
    public void stop()
    {
        System.out.println("Engine stopped");
    }
    public void acc()
    {
        System.out.println("Engine is accelerating");
    }
}
