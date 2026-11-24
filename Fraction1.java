public class Fraction {
    // instance variable (atrributes, fields)

    private int numerator, denominator;

    // constructors
    public Fraction() { // default constructor (no parameter)
        setNum(1);
        setDenom(1);
    }

    public Fraction(int n, int d) { // parameterized constructor
        setNum(n);
        setDenom(d);
    }

    public Fraction(String s) {
        String n = s.substring(0, s.indexOf("/"));
        String d = s.substring(s.indexOf("/") + 1);
        numerator = Integer.parseInt(n);
        denominator = Integer.parseInt(d);
    }

    public Fraction(Fraction f) {
        setNum(f.numerator);
        setDenom(f.denominator);
    }

    // behaviour methods (accessor, mutator, helper)
    public int getNum() { // accessor method, aka getters
        return numerator;
    }

    public int getDenom() { // accessor method
        return denominator;
    }

    public String toString() {
        return numerator + "/" + denominator;
    }

    // Mutator methods
    public void setNum(int n) {
        numerator = n;
    }

    public void setDenom(int d) {
        if (d != 0) {
            denominator = d;
        } else {
            denominator = 1;
            System.out.println("Error");
        }
    }

    public static Fraction mult(Fraction a, Fraction b) {
        int n = a.getNum() * b.getNum();
        int d = a.getDenom() * b.getDenom();
        Fraction answer = new Fraction(n, d);
        answer.reduce();
        return answer;
    }

    public static Fraction div(Fraction a, Fraction b) {
        int n = a.getNum() / b.getDenom();
        int d = a.getDenom() / b.getNum();
        Fraction answer = new Fraction(n, d);
        answer.reduce();
        return answer;
    }
    public static Fraction add(Fraction a, Fraction b) {
        int n1 = a.getNum() * b.getDenom();
        int n2 = b.getNum() * a.getDenom();
        int n = n1 + n2;
        int d = a.getDenom() * b.getDenom();
        Fraction answer = new Fraction(n, d);
        answer.reduce();
        return answer;
    }

    public static Fraction minus (Fraction a, Fraction b) {
        int n1 = a.getNum() * b.getDenom();
        int n2 = b.getNum() * a.getDenom();
        int n = n1 - n2;
        int d = a.getDenom() * b.getDenom();
        Fraction answer = new Fraction(n, d);
        answer.reduce();
        return answer;
    }

    public void reduce() { // no parameter
        int G = GCF(numerator, denominator);
        numerator = numerator / G;
        denominator = denominator / G;
    }

    public int GCF(int a, int b) {
        while (a != b) {
            if (a > b)
                a -= b;
            if (a < b)
                b -= a;
        }
        return a;
    }
}
