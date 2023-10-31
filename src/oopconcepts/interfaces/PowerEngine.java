package oopconcepts.interfaces;

public class PowerEngine implements Engine {

    @Override
    public void acc() {
        System.out.println("powerengine accelerates");

    }

    @Override
    public void start() {
        System.out.println("Powerengine starts");

    }

    @Override
    public void stop() {
        System.out.println("powerengine stops");

    }

}
