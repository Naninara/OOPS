package Interfaces;

public class Car implements Engine,Brakes,Media{
    @Override
    public void brake() {
        System.out.println("GAs brake");
    }

    @Override
    public void brakeType() {
        System.out.println("ABS");
    }

    @Override
    public void start() {
        System.out.println("normal start");
    }

    @Override
    public void stop() {
        System.out.println("normal stop");
    }

    @Override
    public void fuel() {
        System.out.println("petrol");
    }
    //interfaces works same as the abstract classes but the thing is the abstract classes we can insert normal variables
    //and static functions
    //But in in interfaces every method is a abstract classes that has to be overriden by Implements class
    //and all the variables in interfaces are final
    //and also it gives accessability to multiple inheritance
    //because of presence of same methods in both interfaces when u create a same object with all implementation it calls only
    //-one method
    //to overcome this thing u can create various objects by changing the refernce variables to it.


}
