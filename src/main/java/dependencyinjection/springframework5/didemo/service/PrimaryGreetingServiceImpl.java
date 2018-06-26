package dependencyinjection.springframework5.didemo.service;


public class PrimaryGreetingServiceImpl implements GreetingService{
    @Override
    public String sayHello() {
        return "hello from PrimaryGreetingServiceImpl";
    }
}
