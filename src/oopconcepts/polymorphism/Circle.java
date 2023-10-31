package oopconcepts.polymorphism;

public class Circle extends Shapes {

    // this will run when the object of child class is created. hence it overrides
    // the method in
    // parent class.

    @Override
    public void area() {
        System.out.println("This is the area of circle");
    }

}
