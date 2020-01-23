import java.util.*;

public class q1 {

    public static int cycleLength(int n) {
        int count = 1;
        // System.out.println("The sequence for "+ n +" is: ");
        // System.out.print(n + " ");
        while (n != 1) {
            if (n % 2 == 0)
                n = n / 2;
            else
                n = n * 3 + 1;
            // System.out.print(n + " ");
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // System.out.println("The sequence for n is: ");
        // System.out.print(n + " ");
        System.out.println("\nMaximum cycle length is: " + cycleLength(n));

        int i = sc.nextInt();
        int j = sc.nextInt();
        int max = 0, temp;
        int at = 0;
        for (int k = i; k <= j; k++) {
            temp = cycleLength(k);
            if (temp > max) {
                max = temp;
                at = k;
            }
        }
        System.out.println("The max cycle length for sequence i,j is: " + max + " at " + at);
        System.out.println("\nMaximum cycle length for registeration number 17BCE1326: " + cycleLength(1326));
    }
}