package AbstractClasses;

public abstract class Parent {
    //abstract methods the methods are the methods that need to be overide int by the children class
    //if one abstract method is present in class then class must declared as abstract
    //static also not work in abstract because the calling of abstract classes done through the object of child class
    //u cant create object of Abstract classes so if u create a constructor that can be called via child class
    int n;

    public Parent(int n) {
        this.n = n;
    }

    abstract void greeting();
    abstract void hello();
}
