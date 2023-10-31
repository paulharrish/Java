package oopconcepts.polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circle circle = new Circle();
        Square square = new Square();

        // shape.area();
        // circle.area();
        // square.area();

        // method overriding.
        // shapes circle2 = new circle();
        // shapes square1 = new square();
        // shapes square3 = new square();

        Main obj = new Main();
        obj.getArea(circle);
        obj.getArea(square);
        obj.getArea(shape);

    }

    public void getArea(Shapes shape) {
        shape.area();

    };

}
