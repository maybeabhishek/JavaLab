import java.util.*;

public class q2 {
    public static void main(String[] args) {
        final int maths = 90;
        final int english = 85;
        final int hindi = 89;
        final int science = 90;
        final int socialStudies = 88;
        double totalMarks = maths + english + science + hindi + socialStudies; 
        double average = (totalMarks) / 5;
        double perc = totalMarks*100/500;
        System.out.println("Total Marks: "+ totalMarks);
        System.out.println("Average: "+ average);
        System.out.println("Percentage: "+ perc+"%");
        if (average >= 90)
            System.out.println("S grade");
        else if (average < 90 && average >= 80)
            System.out.println("A grade");
        else if (average < 80 && average >= 70)
            System.out.println("B grade");
        else if (average < 70 && average >= 60)
            System.out.println("C grade");
        else if (average < 60 && average >= 50)
            System.out.println("D grade");
        else
            System.out.println("Fail");
    }
}