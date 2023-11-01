package comparisons;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Lambdafunctions<T> {
    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i<5 ; i++){
            arr.add(i+1);
        }

        
        Consumer<Integer> fun = (item) -> System.out.println(item*2);
        // arr.forEach(fun);

        Operation<Integer> sum = (a, b) -> (a+b); //declaring a method in an interface in an single line using lambda functions.
        Operation<Integer> prod = (a, b) -> (a*b); //declaring a method in an interface in an single line using lambda functions.
        Operation<Integer> diff = (a, b) -> (a-b); //declaring a method in an interface in an single line using lambda functions.
    
        
        //we can store the fun in a single variable using consumer type where consumer is an functional interface;
        
        Lambdafunctions<Integer> test = new Lambdafunctions<>();
        System.out.println(test.operate(13, 14, sum));
        System.out.println( test.operate(13, 14, diff));
        System.out.println(test.operate(13, 14, prod));

    }

   

    private T operate(T a, T b, Operation op){
        return  (T) op.operation(a, b);
    }
}
@FunctionalInterface  //functional interface of generic type.
interface Operation<T>{
    T operation(T a,T b);
}

/* We can implement the abstract methods defined int the interface using lambda functions. */