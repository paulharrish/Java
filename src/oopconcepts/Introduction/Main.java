package oopconcepts.Introduction;

public class Main {
    public static void main(String[] args) {

        // creating a class

        Student harrish = new Student(18, "Harrish", 90.0f);
        Student rahul = new Student(13, "Rahul", 89.0f);
        Student ram = new Student();
        Student one = ram;

        System.out.println(one.name);

        System.out.println(harrish.rno);
        System.out.println(harrish.marks);
        System.out.println(harrish.name);
        rahul.greeting();
        

    }
}

class Student {
    int rno;
    String name;
    float marks;

    void greeting() {
        System.out.println("Hello my name is " + this.name);
    }



    Student() {
        // calling another constrctor from this constructor
        this(16, "ram", 88.0f);
    }

    // creating a constuctor
    Student(int rno, String name, float marks) {
        this.rno = rno;
        this.name = name;
        this.marks = marks;

    }
}