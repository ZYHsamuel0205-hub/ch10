import java.util.Random;
import java.util.Scanner;

public class FractionQuiz {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        Fraction f1 = new Fraction();
        Fraction f2 = new Fraction();
        Fraction f3 = new Fraction();
        Fraction f4 = new Fraction();
        Fraction f5 = new Fraction();
        Fraction f6 = new Fraction();
        Fraction f7 = new Fraction();
        Fraction f8 = new Fraction();

        System.out.println(
            "Let the Fraction Quiz Begin. Answer should be in lowest terms. Good luck!");

        System.out.print(f1 + " " + Fraction.setSign(random.nextInt(4)) + " " + f2 + " = ");
        int ans1Entered = in.nextInt(); 
        System.out.print(f3 + " " + Fraction.setSign(random.nextInt(4)) + " " + f4 + " = ");
        int ans2Entered = in.nextInt(); 
        System.out.print(f5 + " " + Fraction.setSign(random.nextInt(4)) + " " + f6 + " = ");
       int ans3Entered = in.nextInt(); 
        System.out.print(f7 + " " + Fraction.setSign(random.nextInt(4)) + " " + f8 + " = 112");
      int ans4Entered = in.nextInt(); 
    }
}
