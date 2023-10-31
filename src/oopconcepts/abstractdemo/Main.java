package oopconcepts.abstractdemo;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(16);
        Daughter daughter = new Daughter(18);

        son.career();
        daughter.career();

        Parent.hello();
        son.greeting();

        System.out.println(son.value);

    }

}
