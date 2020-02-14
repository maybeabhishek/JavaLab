import java.io.FileWriter; // Import the FileWriter class
import java.io.IOException; // Import the IOException class to handle errors
import java.io.PrintWriter;

class Donor{
    String name;
    int age;
    String address;
    int contactNumber;
    String bloodGroup;
    String DateOfLastDonation;

    Donor(){
        ;
    }
    Donor(String name,int age,String address,int contactNumber,String bloodGroup, String DateOfLastDonation){
        this.name = name;
        this.address = address;
        this.age = age;
        this.contactNumber = contactNumber;
        this.bloodGroup = bloodGroup;
        this.DateOfLastDonation = DateOfLastDonation;
    }

    void RandomizeDonor(){
        
    }
}

public class fileHandling {
    public static void main(String[] args) {

        String textToAppend = "Happy Learning !!";
        try {
            FileWriter fileWriter = new FileWriter("donation.txt", true); // Set true for append mode
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.println(textToAppend); // New line
            printWriter.close();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }

    }
}
