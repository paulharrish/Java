package comparisons;

public class Main {
    public static void main(String[] args) {
        
        Student harrish = new Student(18, 90);
        Student rahul = new Student(17, 99);

        if(harrish.compareTo(rahul) < 0){
            System.out.println("Rahul has bigger marks");
        }

    }
}
