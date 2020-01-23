    import java.util.*;

    public class q5 {
        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            float weight = sc.nextFloat();
            float height = sc.nextFloat();

            float bmi = weight / (height * height);

            if (bmi <= 18.5)
                System.out.println("Underweight");
            else if (bmi > 18.5 && bmi <= 25)
                System.out.println("Normal weight");
            else if (bmi > 25 && bmi <= 30)
                System.out.println("Overweight");
            else
                System.out.println("Obese");
        }
    }