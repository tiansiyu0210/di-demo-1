package dependencyinjection.springframework5.didemo.service;


public class PrimaryChineseGreetingService implements GreetingService{
    @Override
    public String sayHello() {
        return "你好 来自 PrimaryChineseGreetingService";
    }
}
