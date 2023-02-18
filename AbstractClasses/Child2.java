package AbstractClasses;

public class Child2 extends Parent{
    Child2(int n){
        super(n);
    }
    @Override
    void greeting() {
        System.out.println("Welcome from child two");
    }

    @Override
    void hello() {
        System.out.println("hello world from child two");
    }
}
