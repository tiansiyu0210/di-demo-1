package dependencyinjection.springframework5.didemo.controller;

import dependencyinjection.springframework5.didemo.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Autowired
    private GreetingService greetingServiceImpl;

    public String sayHello(){
        return greetingServiceImpl.sayHello() + " PropertyInjectedController";
    }

}
