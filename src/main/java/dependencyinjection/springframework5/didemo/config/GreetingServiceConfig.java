package dependencyinjection.springframework5.didemo.config;

import dependencyinjection.springframework5.didemo.service.GreetingService;
import dependencyinjection.springframework5.didemo.service.GreetingServiceFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

@Configuration
public class GreetingServiceConfig {

    @Bean
    public GreetingServiceFactory getGreetingServiceFactory(){
        return new GreetingServiceFactory();
    }

    @Bean
    @Primary
    @Profile({"default", "en"})
    public GreetingService getPrimaryGreetingServiceImpl(GreetingServiceFactory greetingServiceFactory){
        return greetingServiceFactory.createGreetingService("en");
    }

    @Bean
    @Primary
    @Profile("cn")
    public GreetingService getPrimaryChineseGreetingService(GreetingServiceFactory greetingServiceFactory){
        return greetingServiceFactory.createGreetingService("cn");
    }

    @Bean
    @Primary
    @Profile("jp")
    public GreetingService getPrimaryJapaneseGreetingService(GreetingServiceFactory greetingServiceFactory){
        return greetingServiceFactory.createGreetingService("jp");
    }
}
