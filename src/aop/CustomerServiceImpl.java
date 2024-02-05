package aop;

public class CustomerServiceImpl implements CustomerService {

    @Override
    public void doSomething() {
        System.out.println("In the customerrServiceImpl Do Service Method");
    }
}
