import java.util.Scanner;

public class FractionQuiz {
	  public static void main(String[] args) {

     System.out.println ("Let the Fraction Quiz Begin. Answer should be in lowest terms. Good luck!");
        Fraction f1 = new Fraction();
        Fraction f2 = new Fraction(10, 15);
        Fraction f3 = new Fraction("1/2");
        Fraction f4 = new Fraction(f3);
        Fraction half = new Fraction(1, 2);
        Fraction third = new Fraction(1, 3);
        Fraction multiply = Fraction.mult(half, third);
            Fraction division = Fraction.div(half, third);
   Fraction addition = Fraction.add(half, third);
   addition.reduce();
        System.out.println(addition);
   Fraction subtraction = Fraction.minus(half, third);
        subtraction.reduce();
        System.out.println(subtraction);
    }

	}
