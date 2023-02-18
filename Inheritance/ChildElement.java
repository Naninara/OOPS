package Inheritance;

public class ChildElement extends ParentElement{
    int weight ;
    ChildElement(int l, int w,int h,int weight){
        //super(l,w,h);
        //super keyword used to abstract the constructor of parent class;
        //u have use the super keyword at starting of constructor onlu;

        super(l,w,h);
//        this can be write as below
//        l = super.l;
//        w = super.w;
//        h = super.h;

        this.weight = weight;
//        super(l,w,h);
//        if i use super keyword like this this throws an error;
    }
    ChildElement(int s ,int weight){
        super(s);
        this.weight = weight;
    }
    ChildElement(){
        super();
        this.weight=-1;
    }
    static void greet(){
        System.out.println("hi bro im in child");
    }
}
