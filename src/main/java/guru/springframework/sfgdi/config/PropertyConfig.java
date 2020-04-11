package guru.springframework.sfgdi.config;

import guru.springframework.sfgdi.examplebean.FakeDataSource;
import guru.springframework.sfgdi.examplebean.FakeJmsBroker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

@Configuration
//@PropertySource({"classpath:datasource.properties", "classpath:jms.properties"})
@PropertySources({
        @PropertySource("classpath:datasource.properties"),
        @PropertySource("classpath:jms.properties")
})
public class PropertyConfig {

    // load environmental properties
//    @Autowired
//    Environment env;

    // load the properties from the properties Bean.
    @Value("${guru.user}")
    String user;

    @Value("${guru.password}")
    String password;

    @Value("${guru.dburl}")
    String url;

    // load the properties from the properties Bean.
    @Value("${guru.jms.user}")
    String jmsUser;

    @Value("${guru.jms.password}")
    String jmsPassword;

    @Value("${guru.jms.dburl}")
    String jmsUrl;


    // Populate and return the FakeDataSource class
    @Bean
    public FakeDataSource fakeDataSource(){

//        Load from a file
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUser(user);
        fakeDataSource.setPassword(password);
        fakeDataSource.setUrl(url);
        return fakeDataSource;

//        Load from environmental properties
//        FakeDataSource fakeDataSource = new FakeDataSource();
//        fakeDataSource.setUser(env.getProperty("DB_USERNAME"));
//        fakeDataSource.setPassword(env.getProperty("DB_PASSWORD"));
//        fakeDataSource.setUrl(env.getProperty("DB_URL"));
//        return fakeDataSource;

    }

    @Bean
    public FakeJmsBroker fakeJmsBroker(){
//        Load from a file
        FakeJmsBroker fakeJmsSource = new FakeJmsBroker();
        fakeJmsSource.setUser(jmsUser);
        fakeJmsSource.setPassword(jmsPassword);
        fakeJmsSource.setUrl(jmsUrl);
        return fakeJmsSource;
    }

    // This bean will scan for properties file and will upload the datasource.properties
    @Bean
    public static PropertySourcesPlaceholderConfigurer properties(){
        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
        return propertySourcesPlaceholderConfigurer;
    }

}
