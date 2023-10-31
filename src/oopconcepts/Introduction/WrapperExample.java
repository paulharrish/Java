package oopconcepts.Introduction;

public class WrapperExample {
    public static void main(String[] args) {
        int a = 10;

        // Wrapperclass is something like integer.
        Integer num = 15;
        Integer num2 = 20;

        swap(num, num2);

    }
   //this method is static because it does not rquires an instance of this class
    static void swap(Integer a, Integer b) {
        Integer temp = a;
        a = b;
        b = temp;
        System.out.println("The value of a is " + a + " The value of b is " + b);
    }
}
