import java.util.*;

public class q1 {
    public static void main(String args[]) {
        // Scanner sc = new Scanner(System.in);
        final int birthYear = 1960;
        final int birthDay = 29;
        final int birthMonth = 2;
        System.out.println("Mr. X was born on "+birthDay+"th "+ birthMonth+" "+birthYear);
        System.out.println("Mr. X curretn age is "+(2100-birthYear));
        System.out.println("Mr. X has celebrated "+((2101-birthYear)/4)+" birthdays");
    }
}