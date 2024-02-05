package oopconcepts.polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape1 = new Circle();
        shape1.area();
        // Shapes shape1 = new Square();
        // shape1.area();

        Circle circle = (Circle)new Shapes();
        circle.area();

        // Circle circle = new Circle();
        // Square square = new Square();

        // shape.area();
        // circle.area();
        // square.area();

        // Main obj = new Main();
        // obj.getArea(circle);
        // obj.getArea(square);
        // obj.getArea(shape);

    }

    // public void getArea(Shapes shape) {
    // shape.area();

    // };

}
