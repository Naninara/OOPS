package Interfaces;

public class CreateCar {
    private Engine obj = new EngineStructure();
   private final Media obj2 = new CdPalayer();
    public void start(){
        obj.start();
    }
    public void stop(){
       obj.stop();
    }
    public void fuel(){
        obj.fuel();
    }
    public void StartMusic(){
        obj2.start();
    }
    public Engine Upgrade(Engine upgrade){
        this.obj = upgrade;
        return obj;
    }
}
