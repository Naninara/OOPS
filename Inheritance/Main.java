package Inheritance;

public class Main {
    public static void main(String[] args) {
        ChildElement obj = new ChildElement(20,20,6,6);
        ChildElement obj1 = new ChildElement(20,40 );



        ParentElement obj2 = new ChildElement(90,90);
        //if u declare the object with parent clas
        //then the access given to the object is only the variables in parent class;
        //but u cant acccess the variables in child class


        //ChildElement obj3 = new ParentElement(20,50,40);

        //in this case we give access to childElement class variables;
        //but you have to initialize variables of Child element here but you are not initializing here so it throws an error;
        //due to that reason it shows an error

        //multilevel inheritance
        ChildElement2 cobj = new ChildElement2();
        System.out.println(cobj.l+" "+cobj.price+" "+cobj.w);


        //multiple inheritance
        //when one class extended by more than one class in java
        //like class c extends class a and also extends class b;
        //it was not allowed in java
        //because let say we have the variables in the parent class contain same values in both classes
        //it child class confuses to pick up which one so that it not allowed


        //hierichical inheritance:- means one class inherits many classes
        //ex: Class B extends class A
        //Class C extends Class A like that..
        //all the rules in single level inheritance appplied to this


        //final keyword alsoo used to prevent inheritance
        //whenever u declare the class as final it declares all the methods as final

        ParentElement sobj = new ChildElement();
        sobj.greet(); //im in parent
        ParentElement.greet();
        //since static methods cannot overridden it always depend on the refernce type of the object
        //not on the object created like childelemnt()
        //quote
        //overrideing depends on object but the static are independent of object so that static methods are not over ridden

    }
}
