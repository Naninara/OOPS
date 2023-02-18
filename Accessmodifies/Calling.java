package Accessmodifies;

import Inheritance.Main;

public class Calling {
    public static void main(String[] args) {
        MainClass obj = new MainClass(10,"mavin",20);
        obj.setA(20);
        System.out.println(obj.getA());

    }
}
