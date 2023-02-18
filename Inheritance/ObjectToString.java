package Inheritance;

public class ObjectToString {
    int num =0;

    public ObjectToString(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "ObjectToString{" +
                "num=" + num+50 +
                '}';
    }

    public static void main(String[] args) {
        ObjectToString obj = new ObjectToString(10);
        System.out.println(obj);

    }
}
