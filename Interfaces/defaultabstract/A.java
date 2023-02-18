package Interfaces.defaultabstract;

public interface A {
     int a =5;
    default void greeting(){
        System.out.println("hello world");
    }
}
