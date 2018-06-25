package dependencyinjection.springframework5.didemo.service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("cn")
@Primary
public class PrimaryChineseGreetingService implements GreetingService{
    @Override
    public String sayHello() {
        return "你好 来自 PrimaryChineseGreetingService";
    }
}
