import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        Pattern pattern = Pattern.compile("^\\d");

        String words[] = s.split("->");
        int count = 0;
        for (String i : words) {
            String moles[] = i.split("\\+");
            int flag = 0;
            if (count == 0)
                System.out.println("Number of moles in reactants are: ");
            else
                System.out.println("Number of moles in product are: ");
            for (String j : moles) {
                j = j.trim();
                // System.out.println(j);
                Matcher m = pattern.matcher(j);
                System.out.print(j + ": ");
                while (m.find()) {
                    System.out.print(j.charAt(m.start()));
                    flag = 1;
                }
                if(flag==0)
                    System.out.print(1);
                flag = 0;
                System.out.println();
            }
            count = 1;
            System.out.println();
        }
    }
}