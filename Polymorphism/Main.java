package Polymorphism;

public class Main {
    public static void main(String[] args) {
        //polymorphsim is the being in different forms
        //types of polymorphism:-
        //1.compile time/static polymorphism:- this is can be done by method overloading and constructor overloading
            //that means at time of compilation it checks the type of parameter and can be determined at compile time
        //and implement the polymorphism
        //2.Runtime polymorphism /dynamic polymorphism:-this polymorphism can be by method overriding
        //if the parent class contains a method and all the child classes contains the same method same as including
        //return time and type of arguments..
        //the method overriding can be done by the type of an object.

        Area a = new Area();
        Area b = new Sqare();
        //if u do the same in inheritance at creating the objects it cannot access the variables of square
        //but it functions it override the parent class function
        //even the type of object is parent is class which method has to be called and executed depend upon the child object type
        //so that parent class tells which one to run and child object type says which one to access
        //to perform overriding the parent class also contain same method
        //anotation @override is used to know whether the function is override or not
        //the phenomenon of calling the method by the type of object known as upsetting..
        Circle c = new Circle();
        a.area();
        b.area();
        c.area();
        //which method has to be executed? how java knows this?
        //By using dynamic method dispatch
        //Final keyword is used to stop the method overriding
        //so that compiler knows that it can not be modified at the runtime and it makes sure that at the of compilation
        // so it is called the early binding
        // if it no declared with final the dynamic method dipatching comes in to picture
        // so that it can not be modified at the time of compilation so it is called the late binding



        //static methods cannot be ovverriden only the parent class methood is shown and also even it inherited


    }
}
