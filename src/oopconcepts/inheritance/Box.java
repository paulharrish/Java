package oopconcepts.inheritance;

public class Box {
    double l;
    double h;
    double w;

    // these multipe constructors are the example of method overloading; also called
    // as compile time polymorphism.
    Box() {
        this.l = -1;
        this.h = -1;
        this.w = -1;
    }

    Box(double side) {
        this.l = side;
        this.h = side;
        this.w = side;
    }

    Box(double l, double h, double w) {
        this.l = l;
        this.h = h;
        this.w = w;
    }

    Box(Box old) {
        this.l = old.l;
        this.h = old.h;
        this.w = old.w;
    }

    public void information() {
        System.out.println("Running the box");

    }
}
