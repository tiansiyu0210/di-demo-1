package dependencyinjection.springframework5.didemo.controller;

import dependencyinjection.springframework5.didemo.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {

    private GreetingService greetingService;

    //automatic wiring constructor based, so we don;t need @AutoWired
    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayHello() + " ConstructorInjectedController";
    }
}
