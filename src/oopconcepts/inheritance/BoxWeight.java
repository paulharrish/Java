package oopconcepts.inheritance;

public class BoxWeight extends Box {
    double weight;

    public BoxWeight() {
        this.weight = -1;
    }

    public BoxWeight(double l, double h, double w, double weight) { 
        super(l, h, w); // to call the construtor its parent class
        this.weight = weight;
    }

    public BoxWeight(double side , double weight){
        super(side);
        this.weight = weight;
    }

}
