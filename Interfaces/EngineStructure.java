package Interfaces;

public class EngineStructure implements Engine{

    @Override
    public void start() {
        System.out.println("Engine start");
    }

    @Override
    public void stop() {
        System.out.println("Engine stop");
    }

    @Override
    public void fuel() {
        System.out.println("petrol  ");
    }
}
