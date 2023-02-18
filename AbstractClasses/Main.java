package AbstractClasses;

public class Main {
    public static void main(String[] args) {
        Child1 obj = new Child1(20);
        obj.greeting();
        obj.hello();

        Child2 obj1 = new Child2(50);
        obj1.greeting();
        obj1.hello();
    }
}
