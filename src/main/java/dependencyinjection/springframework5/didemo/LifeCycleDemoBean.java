package dependencyinjection.springframework5.didemo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


@Component
public class LifeCycleDemoBean implements InitializingBean,
                                            DisposableBean,
                                            BeanNameAware,
                                            BeanFactoryAware,
                                            ApplicationContextAware {

    public LifeCycleDemoBean() {
        System.out.println("----in the LifeCycleDemoBean Constructor---");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("---bean factory has been set");
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("--- my bean name is :" + s);
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("---LifeCycleDemoBean bean has been destroyed");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("---LifeCycleDemoBean bean has its properties set");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("--- ApplicationContext has ben set");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("--- PostConstruct annotation has been called");
    }

    @PreDestroy
    public void perDestroy() {
        System.out.println("--- the PreDestroy annotation has benn called");
    }

    public void beforeInit(){
        System.out.println("--- Before Init, called by Bean Post processor");
    }

    public void afterInit(){
        System.out.println("--- After init, called by Bean Post processor");
    }
}
