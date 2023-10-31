package oopconcepts.interfaces.extendDemo;

public interface A {
    // static interface methods should always have a body since they cannot be
    // override.

    static void greeting() {
        System.out.println("Hi there!");
    }

    default public void fun() {
        System.out.println("i am in A");
    }

}
