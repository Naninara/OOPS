package HvLLAssignment;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

class ResidencialSociety{
    String societyName;
    String location;
    String secoratoryName;
}
class Building extends ResidencialSociety
{
    String bulidingName;
    int totalApartments;

    public Building(int totalApartments) {
        this.totalApartments = totalApartments;
    }

    public Building(String bulidingName) {
        this.bulidingName = bulidingName;
    }
}
class ApartMent extends Building
{
    int apartmentNumber;
    String ownerName;
    String electricMeter;

    public ApartMent(int apartmentNumber,String bulidingName, String ownerName, String electricMeter) {
        super(bulidingName);
        this.apartmentNumber = apartmentNumber;
        this.ownerName = ownerName;
        this.electricMeter = electricMeter;
    }
}


public class Q4_InheritanceAndFileIO {
    public static void main(String[] args) {
        ResidencialSociety societyObj = new ResidencialSociety();
        Building buildingA = new Building(10);
        Building buildingB = new Building(10);
        Building buildingC = new Building(10);
        ApartMent[] A = new ApartMent[10];
        ApartMent[] B = new ApartMent[10];
        ApartMent[] C = new ApartMent[10];
        try {
            String file ="Demodata.csv";
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line =null;
            while ((line = br.readLine())!=null){
                    String[] arr = line.split(",");
                for (int i = 0; i <10 ; i++) {
                    A[i] = new ApartMent(Integer.parseInt(arr[0]),arr[1],arr[2],arr[3]);
                }
                for (int i = 0; i <10 ; i++) {
                    B[i] = new ApartMent(Integer.parseInt(arr[0]),arr[1],arr[2],arr[3]);
                }
                for (int i = 0; i <10 ; i++) {
                    C[i] = new ApartMent(Integer.parseInt(arr[0]),arr[1],arr[2],arr[3]);
                }

            }
            for (int i = 0; i < 10; i++) {
                System.out.println(A[i].apartmentNumber+" "+A[i].bulidingName+" "+A[i].ownerName+" "+A[i].electricMeter);
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

}
