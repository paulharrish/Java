package oopconcepts.inheritance;

public class BoxPrice extends BoxWeight {
    double price;

    public BoxPrice(double side, double weight, double price) {
        super(side, weight);
        this.price = price;
    }
}
