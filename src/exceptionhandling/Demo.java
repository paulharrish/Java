package exceptionhandling;

public class Demo{
    public static void main(String[] args) {
        try{

            throw new ArithmeticException("mimicing an exception");
            
        }catch(Exception e){
            System.out.println(e.getLocalizedMessage());
        }finally{
            System.out.println("This will always execute!");
        }
    }
}
