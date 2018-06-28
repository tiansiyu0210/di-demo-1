package dependencyinjection.springframework5.didemo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import dependencyinjection.springframework5.didemo.bean.DatabaseBeanSample;

@Configuration
@PropertySource("classpath:database.properties")
public class PropertyConfig {

    @Value("${mysql.username}")
    String username;

    @Value("${mysql.password}")
    String password;

    @Value("${mysql.url}")
    String url;

    @Bean
    public DatabaseBeanSample getDataBaseBean(){
        DatabaseBeanSample databaseBeanSample = new DatabaseBeanSample();
        databaseBeanSample.setPassword(password);
        databaseBeanSample.setUrl(url);
        databaseBeanSample.setUsername(username);
        return databaseBeanSample;
    }

    @Bean
    public static PropertySourcesPlaceholderConfigurer properties(){
        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
        return propertySourcesPlaceholderConfigurer;
    }


}
