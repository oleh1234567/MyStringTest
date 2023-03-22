package mypac;

public class MyService {

    private String someProperty;

    public void doSomething() {
        System.out.println("Doing something with MyService...");
        System.out.println("someProperty: " + someProperty);
    }

    public void setSomeProperty(String someProperty) {
        this.someProperty = someProperty;
    }

}
