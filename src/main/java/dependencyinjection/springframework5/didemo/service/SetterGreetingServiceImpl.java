package dependencyinjection.springframework5.didemo.service;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingServiceImpl implements GreetingService{
    @Override
    public String sayHello() {
        return "hello from SetterGreetingServiceImpl";
    }
}
