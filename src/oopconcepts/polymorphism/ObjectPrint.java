package oopconcepts.polymorphism;

public class ObjectPrint {
    int num;

    public ObjectPrint(int num) {
        this.num = num;

    }

    // this is called dynamic polymorphism or method overriding
    @Override
    public String toString() {
        return "the number is " + num;

    }

    public static void main(String[] args) {

        ObjectPrint obj = new ObjectPrint(12);

        System.out.println(obj);
        System.out.println(obj.hashCode());

    }

    @Override
    public int hashCode() {
        return num;

    }
} // the hashcode function is used to print the unique hash value of a number
