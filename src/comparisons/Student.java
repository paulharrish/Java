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
        int diff = (this.marks - o.marks);
        return diff;

        //if diff = 0; both are equal
        //if diff< 0 o is bigger;
        // this is bigger;
    }
    
}
