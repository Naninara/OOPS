package HvLLAssignment;
class Node{
    int val;
    Node next;

    public Node(int val) {
        this.val = val;
    }

}
 class LinkedList {
    Node head;

    public void addBack(int val){
        Node node = new Node(val);
        if(head==null){
            head = node;
        }
        else{
            Node temp = head;
            while (temp.next!=null){
                temp = temp.next;
            }
            temp.next = node;
        }
    }
    public void display(){
        Node node = head;
        while (node!=null){
            System.out.print(node.val+"-->");
            node = node.next;
        }
        System.out.print("End");
        System.out.println();
    }
    public void deleteDuplictes(){
        Node node = head;
        while(node.next!=null){
            if(node.val==node.next.val){
                node.next = node.next.next;
            }
            else{
                node = node.next;
            }
        }
    }
}
class Main{
    public static void main(String[] args) {
        LinkedList li = new LinkedList();
        li.addBack(20);
        li.addBack(20);
        li.addBack(30);
        li.addBack(30);
        li.addBack(50);
        li.addBack(60);
        li.addBack(60);
        li.display();
        li.deleteDuplictes();
        System.out.println("after deleting dulplicates");
        li.display();
    }
}
