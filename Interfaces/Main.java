package Interfaces;

public class Main {
    public static void main(String[] args) {
//        Car obj = new Car();
//        //it gets all the classes in all the other classes
//        obj.brake();
//        obj.brakeType();
//        obj.stop();
//        obj.start();
        CreateCar car = new CreateCar();
        ElectricEngine ec = new ElectricEngine();

        car.StartMusic();
        car.start();
        car.stop();
        car.Upgrade(ec);
        car.stop();
        car.start();
        //u can create a static methods in interfaces but have to provide the block for those methods.
        //since static methods cannot be overriden
    }
}
