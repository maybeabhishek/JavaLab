import java.util.*;
public class q4{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int sum = Integer.parseInt(a) + Integer.parseInt(a+a) +Integer.parseInt(a+a+a)+Integer.parseInt(a+a+a+a);
        System.out.println("The sum of a+aa+aaa+aaa is: "+ sum);
    }
}