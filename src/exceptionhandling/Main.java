package exceptionhandling;

import oopconcepts.accessspecifiers.A;

public class Main {
    public static void main(String[] args) {
    int a = 5;
    int b = 0;
    try{
        String name = "Harrish";
        if(name.equals("Harrish")){
            throw new MyException("Name is harrish");
        }
    }
    catch(MyException e){
        System.out.println(e.getMessage());

    }finally{
        System.out.println("This will always execute!");
    }
    }

    static int divide(int a, int b) throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException("Do not divide by zero");
        }

        return a/b;
    }
}
