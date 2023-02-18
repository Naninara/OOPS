package Constructor;
import java.util.Scanner;
class student{
    String name;
    int roll;

    student(){
        name = "siva";
        roll =340;
    }

    student(String name, int roll) {
        this.name = name;
        this.roll = roll;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        sc.nextLine();
        String name = sc.nextLine();
        student obj = new student(name,n);
        System.out.println(obj.name+" "+obj.roll);
        obj.name = name;
        obj.roll = n;
        System.out.println(obj.name+" "+obj.roll);
    }
}
