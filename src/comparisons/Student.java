package comparisons;

public class Student implements Comparable<Student>{

    int rollno;
    int marks;
    public Student(int rollno, int marks) {
        this.rollno = rollno;
        this.marks = marks;
    }
    @Override
    public int compareTo(Student o) { 
        return (this.marks - o.marks);
    } 

    @Override
    public String toString() {
        return (marks + "");
    }
}
