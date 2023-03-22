package mypac;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyApp {

    public static void main(String[] args) {
        // Load the Spring application context from the XML configuration file
        ApplicationContext context = new ClassPathXmlApplicationContext("myConfig.xml");

        // Get the "myService" bean from the application context
        MyService myService = (MyService) context.getBean("myService");

        // Use the service
        myService.doSomething();
    }

}
