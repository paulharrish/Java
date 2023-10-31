package comparisons;

import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
        
        Student harrish = new Student(18, 90);
        Student rahul = new Student(17, 99);
        Student ram = new Student(16, 49);
        Student vijay = new Student(15, 78);
        Student priya = new Student(14, 87);

        Student[] list = {harrish,rahul,ram,vijay,priya};

        System.out.println(Arrays.toString(list));
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
        
    }
}
