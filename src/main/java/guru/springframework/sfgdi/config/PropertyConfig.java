package guru.springframework.sfgdi.config;

import guru.springframework.sfgdi.examplebean.FakeDataSource;
import guru.springframework.sfgdi.examplebean.FakeJMLSource;
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

public class PropertyConfig {

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

// JML example

    // load the properties from the properties Bean.
    @Value("${guru.jml.user}")
    String jmlUser;

    @Value("${guru.jml.password}")
    String jmlPassword;

    @Value("${guru.jml.dburl}")
    String jmlUrl;


    // Populate and return the FakeDataSource class
    @Bean
    public FakeDataSource fakeDataSource(){
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUser(user);
        fakeDataSource.setPassword(password);
        fakeDataSource.setUrl(url);
        return fakeDataSource;
    }

    @Bean
    public FakeJmsBroker fakeJmsBroker(){
        FakeJmsBroker fakeJmsSource = new FakeJmsBroker();
        fakeJmsSource.setUser(jmsUser);
        fakeJmsSource.setPassword(jmsPassword);
        fakeJmsSource.setUrl(jmsUrl);
        return fakeJmsSource;
    }

    @Bean
    public FakeJMLSource fakeJMLSource(){
        FakeJMLSource fakeJMLSource= new FakeJMLSource();
        fakeJMLSource.setUser(jmlUser);
        fakeJMLSource.setPassword(jmlPassword);
        fakeJMLSource.setUrl(jmlUrl);
        return fakeJMLSource;
    }

}
