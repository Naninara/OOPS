package Linkedlist;

public class LinkedList {
    Node head;

    public void insert(int value){
        Node node = new Node();
        node.next =null;
        node.data = value;
        if(head==null){
           head = node;
        }
        else{
            Node n= head;
            while(n.next!=null){
                n = n.next;
            }
            n.next = node;
        }


    }
    public void show(){
        Node node = head;
        while(node.next!=null){
            System.out.println(node.data+" ");
            node = node.next;
        }
        System.out.println(node.data+" ");
    }
    public void insertAtStart(int data){
        Node node = new Node();
        node.data = data;
        node.next =null;
        node.next = head;
        head = node;
    }
    public  void insertAtIndex(int index , int data){
        Node node = new Node();
        node.data = data;
        Node n = head;
        for (int i =0;i<index-1;i++){
         n = n.next;
        }
        node.next = n.next;
        n.next = node;
    }
    public void deleteAt(int index){
        if(index ==0){
            head = head.next;
        }
        Node n = head;

        for (int i = 0; i < index - 1; i++) {
            n = n.next;
        }

        n.next =n.next.next;
    }
}
