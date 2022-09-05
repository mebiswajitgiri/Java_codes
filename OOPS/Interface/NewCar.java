package com.company.OOPS.Interface;

public class NewCar
{
    private Engine engine;
    private Media player;
    public NewCar() {
        engine = new PetrolCar();
        player=new CDplayer();
    }
    public NewCar(Engine engine)
    {
        this.engine=engine;
    }
    public void startEngine()
    {
        engine.start();
    }
    public void stopEngine()
    {
        engine.stop();
    }
    public void accEngine()
    {
        engine.acc();
    }
    public void startMusic()
    {
        player.start();
    }
    public void stopMusic()
    {
        player.stop();
    }
}
