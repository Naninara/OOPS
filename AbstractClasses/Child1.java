package AbstractClasses;

public class Child1 extends Parent{
    public Child1(int n) {
        super(n);
    }

    @Override
    void greeting() {
        System.out.println("Welcome from child one");
    }

    @Override
    void hello() {
        System.out.println("hello world from child one");
    }
}
