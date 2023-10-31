package oopconcepts.accessspecifiers;

public class Main {
    public static void main(String[] args) {
        A obj = new A(2, "Harrish");

        System.out.println(obj.getNum());
        obj.setNum(15);
    }

}
