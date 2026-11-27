import java.util.Random;
import java.util.Scanner;

public class FractionQuiz {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        boolean playing = true;

        System.out.println(
            "Let the Fraction Quiz Begin. Answer should be in lowest terms. Good luck!");

        while (playing) {
            Fraction f1 = new Fraction();
            Fraction f2 = new Fraction();
            int s = random.nextInt(4);
            String sign = Fraction.setSign(s);
            String answer = "";
            
            
                if (s == 0)
            answer = Fraction.add(f1, f2).toString();
        if (s == 1)
              answer = Fraction.minus(f1, f2).toString();
        if (s == 2)
           answer = Fraction.mult(f1, f2).toString();
        if (s == 3)
           answer = Fraction.div(f1, f2).toString();
            
            System.out.print(f1 + " " + sign + " " + f2 + " = ");
            String entered = in.nextLine();
if (entered.equals(answer)) {
	 System.out.println ("Correct");
	} else {
	 System.out.println ("Wrong, the answer is " + answer);
		}

            if (entered.equals("quit"))
                playing = false;
        }
    }
}
