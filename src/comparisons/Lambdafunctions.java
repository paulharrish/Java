package comparisons;

import java.util.ArrayList;

public class Lambdafunctions {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i<5 ; i++){
            arr.add(i+1);
        }

        arr.forEach((item) -> {System.out.println(item*2);});
        
    }

    public Integer add(Integer a, Integer b){
        return a+b;
    }
}
