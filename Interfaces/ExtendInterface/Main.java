package Interfaces.ExtendInterface;

public class Main implements B{
    @Override
    public void hello() {
        System.out.println("hello world");
    }

    @Override
    public void greet() {
        System.out.println("welcome");
    }
}
