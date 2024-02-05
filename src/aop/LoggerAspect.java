package aop;

public class LoggerAspect {

    public void logBefore() {
        System.out.println("Loggin before...");
    }

    public void logAfter() {
        System.out.println("Logging After...");
    }
}
