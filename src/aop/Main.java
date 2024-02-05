package aop;

public class Main {
    public static void main(String[] args) {
        CustomerServiceImpl customerService = new CustomerServiceImplProxy();
        customerService.doSomething();
        
        
    }
}
