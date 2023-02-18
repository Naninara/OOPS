package Linkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedList li = new LinkedList();
        li.insert(20);
        li.insert(50);
        li.insert(30);
        li.insert(80);
        li.insert(90);


        li.deleteAt(4);
        li.show();
    }
}
