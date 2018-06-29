package dependencyinjection.springframework5.didemo.config;

import dependencyinjection.springframework5.didemo.bean.JmsBeanSample;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import dependencyinjection.springframework5.didemo.bean.DatabaseBeanSample;

@Configuration
public class PropertyConfig {

    @Value("${mysql.username}")
    String username;

    @Value("${mysql.password}")
    String password;

    @Value("${mysql.url}")
    String url;

    @Value("${jms.username}")
    String jmsUsername;

    @Value("${jms.password}")
    String jmsPassword;

    @Value("${jms.url}")
    String jmsUrl;

    @Bean
    public JmsBeanSample getJmsBean(){
        JmsBeanSample jmsBeanSample = new JmsBeanSample();
        jmsBeanSample.setPassword(jmsPassword);
        jmsBeanSample.setUsername(jmsUsername);
        jmsBeanSample.setUrl(jmsUrl);
        return jmsBeanSample;
    }

    @Bean
    public DatabaseBeanSample getDataBaseBean(){
        DatabaseBeanSample databaseBeanSample = new DatabaseBeanSample();
        databaseBeanSample.setPassword(password);
        databaseBeanSample.setUrl(url);
        databaseBeanSample.setUsername(username);
        return databaseBeanSample;
    }
}
