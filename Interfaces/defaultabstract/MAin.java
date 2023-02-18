package Interfaces.defaultabstract;

public class MAin implements B,A{
    @Override
    public void greeting() {
        A.super.greeting();
    }
}
