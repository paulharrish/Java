package oopconcepts.accessspecifiers;

public class A {
    private int num;
    protected String name;

    public A(int num, String name) {
        this.num = num;
        this.name = name;

    }

    // getter and setter methods to access private variables;
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
        System.out.println("the value had changed to" + " " + num);
    }
}
