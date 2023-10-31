package oopconcepts.inheritance;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box(4.6, 7, 8);
        Box box2 = new Box(box1);

        System.out.println(box1.l + " " + box1.h + " " + box1.w);
        System.out.println(box2.l + " " + box2.h + " " + box2.w);

        BoxWeight box3 = new BoxWeight(1, 2, 3, 4);

        // upcasting
        Box box6 = new BoxWeight(1, 2, 3, 4);
        

       

        // downcasting explicitly - compile time no error.
        BoxWeight box7 = (BoxWeight) new Box();

        BoxWeight box8 = (BoxWeight) box6;

        // System.out.println(box3.l + " " + box3.h + " " + box3.w + " " + box3.weight);
    }
}
