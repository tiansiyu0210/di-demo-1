package dependencyinjection.springframework5.didemo.service;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingServiceImpl implements GreetingService{

    @Override
    public String sayHello() {
        return "hello from ConstructorGreetingServiceImpl";
    }

}
