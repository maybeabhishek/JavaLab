import java.util.*;
import java.util.regex.*;

class InvalidArgumentException extends Exception {
    InvalidArgumentException(String s) {
        super(s);
    }
}

class NumberFormatException extends Exception {
    NumberFormatException(String s) {
        super(s);
    }
}

class NoSuchElementException extends Exception {
    NoSuchElementException(String s) {
        super(s);
    }
}

class q1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter registeration number: ");
        String regno = s.next();
        System.out.print("\nEnter Phone number: ");
        String phno = s.next();
        try {
            if (regno.length() != 9 || phno.length() != 10)
                throw new InvalidArgumentException("Enter a valid registeration number or phone number");
            else if (!Pattern.matches("\\d{10}", phno))
                throw new NumberFormatException("Enter a valid phone number");
            else if(!Pattern.matches("\\d{2}[a-zA-Z]{3}\\d{4}$", regno))
                throw new NoSuchElementException("Enter valid registeration number");
            else
                System.out.println("Valid");
        } catch (Exception i) {
            System.out.println(i);
        }
    }
}