package oopconcepts.interfaces;

public class Main {
    public static void main(String[] args) {
        Car Car = new Car();

        Car.acc();
        Car.brake();
        Car.start();
        Car.stop();

        Media carmedia = new Car();

        carmedia.stop();

        NiceCar car = new NiceCar();

        car.start();
        car.startMusic();
        car.upgradeEngine();
        car.start();

        NiceCar car2 = new NiceCar();

    }
}
