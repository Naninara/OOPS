package Generics;

public class Main {
    public static void main(String[] args) {
        CustomArrayList list = new CustomArrayList();
        list.add(20);
        list.add(300);
        list.add(400);
        list.remove();
        list.print();
        System.out.println(list.size());
    }
}
