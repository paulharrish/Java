package aop;

public class CustomerServiceImplProxy extends CustomerServiceImpl {

    LoggerAspect loggerAspect = new LoggerAspect();

    @Override
    public void doSomething() {
        loggerAspect.logBefore();
        super.doSomething();
        loggerAspect.logAfter();
    }
}
