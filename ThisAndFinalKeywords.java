
public class ThisAndFinalKeywords {
    public static void main(String[] args) {
        //this keyword is used to define the currently exectuing object
        //alsoo to differenciate local and global variable in constructor
        A data = new A("nara");
        System.out.println(data.str);
       // data.a = 20;
        // when a  variable(primitives) declared with final keyword we cannot reassign it to other value;
        final A random = new A("Mavin");
       // random = new A("manikanta"); throws an error
       // when non primitives declared as final we can change value but canont re assign it;




    }
}
class A{
    int s = 0;
    int m =0;
    final  int a = 0;
    String str;
    A(String name){
        //A data = new A(); creating object
        //this repalces with data here i.e object name;
        this.str = "String name";

    }
}
