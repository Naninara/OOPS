package FinalizeMethod;

public class Finalll {

    void name(){
        System.out.println("hiiiiiiiiiiiiiiiii");
    }
    void num(){
        System.out.println("144444444444444444");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("object destroyed");
    }
    //this method hits automatically when the garbage collection hits
}
