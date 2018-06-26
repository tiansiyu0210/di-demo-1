package dependencyinjection.springframework5.didemo.service;

public class GreetingServiceFactory {

    public GreetingService createGreetingService(String lang){

        switch (lang){
            case "en":
                return new PrimaryGreetingServiceImpl();
            case "cn" :
                return new PrimaryChineseGreetingService();
            case "jp" :
                return new PrimaryJapaneseGreetingService();
            default:
                return new PrimaryGreetingServiceImpl();
        }

    }
}
