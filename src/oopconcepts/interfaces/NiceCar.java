package oopconcepts.interfaces;

public class NiceCar {
    private Engine Engine;
    private Media player = new CDPlayer();

    public NiceCar() {
        this.Engine = new PowerEngine();
    }

    public NiceCar(Engine Engine) {
        this.Engine = Engine;
    }

    public void start() {
        Engine.start();
    }

    public void stop() {
        Engine.stop();
    }

    public void startMusic() {
        player.start();
    }

    public void stopMusic() {
        player.start();
    }

    public void upgradeEngine() {
        this.Engine = new ElectricEngine();
        System.out.println("Car upgraded to electric engine");

    }

}
