package oopconcepts.abstractdemo;

//cannot create abstract constructors
//cannot create abstract static methods
//atleast one method should be abstract if the class is abstract
//we cannot create object for an abstract class.if want to, then all the methods must be overriden;
public abstract class Parent {

    int age;
    final int value;

    public Parent(int age) {
        this.age = age;
        this.value = 78977676;
    }

    static void hello() {
        System.out.println("Hey!");

    }

    void greeting() {
        System.out.println("Hii!");
    }

    abstract void career();

    abstract void partner();

}
