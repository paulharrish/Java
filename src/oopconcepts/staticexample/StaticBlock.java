package oopconcepts.staticexample;

public class StaticBlock {
    static int a = 5;
    static int b;

    // this will run only one when the first obj is created; ie., when class is
    // loaded for the first time
    static {
        System.out.println("I am inside a static block");
        b = a * 4;
    }
    {
        System.out.println("I am inside initializer block");
    }

    public static void main(String[] args) {
        StaticBlock obj = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);

        StaticBlock.b += 3;

        StaticBlock obj2 = new StaticBlock();
        System.out.println(StaticBlock.a + " " + StaticBlock.b);
    }
}
