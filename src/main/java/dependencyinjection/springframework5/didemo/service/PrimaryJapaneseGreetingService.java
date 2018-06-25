package dependencyinjection.springframework5.didemo.service;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("jp")
@Primary
public class PrimaryJapaneseGreetingService implements GreetingService {
    @Override
    public String sayHello() {
        return "こんにちは";
    }
}
