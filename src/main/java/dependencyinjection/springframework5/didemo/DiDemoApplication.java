package dependencyinjection.springframework5.didemo;

import dependencyinjection.springframework5.didemo.bean.DatabaseBeanSample;
import dependencyinjection.springframework5.didemo.controller.ConstructorInjectedController;
import dependencyinjection.springframework5.didemo.controller.MyController;
import dependencyinjection.springframework5.didemo.controller.PropertyInjectedController;
import dependencyinjection.springframework5.didemo.controller.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiDemoApplication {

    public static void main(String[] args) {

        ApplicationContext applicationContext = SpringApplication.run(DiDemoApplication.class, args);

        MyController myController = (MyController) applicationContext.getBean("myController");

        //myController.hello();

        System.out.println(myController.hello());
        System.out.println(applicationContext.getBean(PropertyInjectedController.class).sayHello());
        System.out.println(applicationContext.getBean(SetterInjectedController.class).sayHello());
        System.out.println(applicationContext.getBean(ConstructorInjectedController.class).sayHello());

        DatabaseBeanSample databaseBeanSample = applicationContext.getBean(DatabaseBeanSample.class);
        System.out.println("========print out properties in database.properties file=======");
        System.out.println(databaseBeanSample.getUsername());
        System.out.println(databaseBeanSample.getPassword());
        System.out.println(databaseBeanSample.getUrl());
    }
}
