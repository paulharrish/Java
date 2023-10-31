package oopconcepts.staticexample;

public class Main {
    public static void main(String[] args) {
        Human rahul = new Human(16, "rahul", 10000, false);
        Human ram = new Human(17, "ram", 20000, true);

        System.out.println(rahul.name);
        System.out.println(ram.name);
        System.out.println(Human.population);

        Human.message();

    }

}
