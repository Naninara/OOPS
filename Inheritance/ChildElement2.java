package Inheritance;

public class ChildElement2 extends  ChildElement{
    //when 2 or more classes inherit one by one then it called as multiple inheritance;
    //in this the super keyword refer to ChildElement
    int price ;
    ChildElement2(){
        super();
        this.price =-1;
    }

    public ChildElement2(int l, int w, int h, int weight, int price) {
        super(l, w, h, weight);
        this.price = price;
    }
}
