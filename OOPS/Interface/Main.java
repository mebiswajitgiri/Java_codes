package com.company.OOPS.Interface;

public class Main  {
    public static void main(String[] args)
    {
        //System.out.println(Engine.price);
        //System.out.println(Brake.price);
//        Media obj = new Car();
//        obj.stop();
//        Engine obj2 = new Car();
        NewCar car = new NewCar();
        car.stopEngine();
        car.startMusic();
        car.stopMusic();
        car.accEngine();
        car.stopEngine();
    }
}
