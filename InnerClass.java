
public class InnerClass {
    //when the inner class is created you need to be declare that as static since it depend upon outer class
    //to access outer class functions u need to be create an object
    //to access inner class u have to change it as static or put it outside of class

    static class mavin{
        int no = 40;
        String name;
        mavin(String name , int roll){
            this.no = roll;
            this.name = name;
        }

        public static void main(String[] args) {
            mavin details = new mavin("manikanta",20);
            System.out.println(details.name);
            System.out.println(details.no);

        }
    }
}
