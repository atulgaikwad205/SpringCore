package com.example.FileHandling.MethodLifecycle;



public class ByUsingAnnotation {
    private String name;

    public ByUsingAnnotation(String name) {
        this.name = name;
    }
    public ByUsingAnnotation() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "ByUsingAnnotation{" +
                "name='" + name + '\'' +
                '}';
    }

//    @PostConstruct
    public void start(){
        System.out.println("starting method");
    }

//    @PreDestroy
    public void end(){
        System.out.println("ending method");
    }
}
