package oopconcepts.interfaces.extendDemo;

public class main implements A, B {

    @Override
    public void greet() {
        System.out.println("This is in main");

    }

    public static void main(String[] args) {
        main obj = new main();
        A.greeting();
        obj.greet();    
    }

}
