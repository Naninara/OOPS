package AbstractClasses.LambdaFunctions;

public class main {
    public static void main(String[] args) {
        //if u create a class for a functional interface that makes the code to read complex and bulky
        //for that situation me use Anonymous classes upto java 7
        FunctionalInterface obj = new FunctionalInterface() {
            @Override
            public void hello() {
                System.out.println("hello world");
            }
        };
        //above i create a anonymous class here
        //to make the code easier we can use the lambda functions
//        like below
        FunctionalInterface obj1 = () ->{System.out.println("hello world");};
        //same like arrayList forEach method
    }
}
