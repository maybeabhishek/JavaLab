
import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter range");
        int low = s.nextInt();
        int high = s.nextInt();
        TwinPrimes.findTwins(low, high);
    }
}