package Generics;



public class CustomArrayList {
    private  int DEFAULT_VALUE =10;
    int[] arr = new int[DEFAULT_VALUE];
      private int size =0;
    public  void add(int n){
        if(isFull()){
            resize();
        }
        arr[size++]= n;
    }

    public   void resize() {
        int[] temp = new int[DEFAULT_VALUE*2];
        for (int i = 0; i < size; i++) {
            temp[i]=arr[i];
        }
        arr = temp;

    }

    public   boolean isFull() {
            if(size==DEFAULT_VALUE) return true;
            else return false;
    }
    public void print(){
        for (int i = 0; i < size; i++) {
            System.out.println(arr[i]);
        }
    }
    public  int size(){
        return size;
    }
    public void remove(){
        arr[size]=0;
        size--;
    }
    public int get(int index){
        return arr[index];
    }
    public void set(int index, int value){
        arr[index]=value;
    }

}
