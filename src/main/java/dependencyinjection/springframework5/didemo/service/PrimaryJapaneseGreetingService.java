package dependencyinjection.springframework5.didemo.service;



public class PrimaryJapaneseGreetingService implements GreetingService {
    @Override
    public String sayHello() {
        return "こんにちは";
    }
}
