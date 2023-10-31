package oopconcepts.interfaces;

public class ElectricEngine implements Engine {
    @Override
    public void acc() {
        System.out.println("Electric engine accelerates");

    }

    @Override
    public void start() {
        System.out.println("Electric engine starts");

    }

    @Override
    public void stop() {
        System.out.println("Electric engine stops");

    }

}
