package mypac;

import org.springframework.context.ApplicationContext;

public class MyClass {
    public static void main(String[] args) {
        String factoryBeanPrefix = ApplicationContext.FACTORY_BEAN_PREFIX;
        System.out.println(factoryBeanPrefix);
    }
}
