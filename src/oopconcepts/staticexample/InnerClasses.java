package oopconcepts.staticexample;

public class InnerClasses {

    // this method is defined static so that it is independent of the innerclasses;
    static class Test {
        static String name;

        public Test(String name) {
            Test.name = name;

        }

    }

    public static void main(String[] args) {

        Test a = new Test("Rahul");
        Test b = new Test("Ram");

        System.out.println(a);

    }

}
