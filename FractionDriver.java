public class FractionDriver {

public static void main (String[] args) {
	
	Fraction f1 = new Fraction();
	Fraction f2 = new Fraction(100, 101);	
	System.out.println(f1);
	System.out.println(f1.getNum() + "/" + f1.getDemon());
	System.out.println(f2.getNum() + "/" + f2.getDemon());
	}
}
