public class SingletonClass {
    //single ton class refers to only one object is being cretaed;
    //this can be done by making the constructor cannot be called by making it private;
    //and create a new static object
    //so that that object can access through the Class name
    //that means it can be accessed on in the class not outside
    //and object is created by using a function;
    public static void main(String[] args) {
        Student obj = Student.getObject();
        Student obj1 = Student.getObject();
        System.out.println(obj.num);
    }

}
class Student{
    private  Student(){

    }
    static Student object;
    int num =20;
    public static Student getObject(){
        if(object == null){
            object = new Student();
        }
        return object;
    }
}
