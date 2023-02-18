package Accessmodifies;

public class MainClass {


    private int a ;
    //u cant access private variables outside the class u can do then using setters and getters.

    String s;
    protected int b ;
    public MainClass(int a, String s) {
        this.a = a;
        this.s = s;
    }

    public MainClass(int a, String s, int b) {
        this.a = a;
        this.s = s;
        this.b = b;
    }

    private void greet(){
        System.out.println("hello world");
    }


    public void setA(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }
}
