package Inheritance;

public class ParentElement {

    int l;
    int w;
    int h;

    ParentElement(){
        this.l=-1;
        this.w=-1;
        this.h=-1;


    }
    ParentElement(int l, int w, int h){
       // super();
//        this refer to object class
        this.l =l;
        this.w =w;
        this.h =h;

    }
    ParentElement(int s){
        this.l =s;
        this.w =s;
        this.h =s;
    }
    static void greet(){
        System.out.println("hi bro im in parent");
    }
}
