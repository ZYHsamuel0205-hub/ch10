//static calls from class!!!!!!!
//  void = method that performs an action, does not return any value
//object needs toString() to be converted & printed 

import java.util.Random;

public class Fraction {
    // instance variable (atrributes, fields)

    private int numerator, denominator;

    // constructors
    public Fraction() { // default constructor (no parameter)
        Random random = new Random();

        setNum(random.nextInt(9) + 1);
        setDenom(random.nextInt(9) + 1);
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

    public static String setSign(int s) {
        String sign = "";

        if (s == 0)
            sign += "+";
        if (s == 1)
            sign += "-";
        if (s == 2)
            sign += "*";
        if (s == 3)
            sign += "/";
        return sign;
    }

    public static Fraction mult(Fraction a, Fraction b) {
        int n = a.getNum() * b.getNum();
        int d = a.getDenom() * b.getDenom();
        Fraction answer = new Fraction(n, d);
        answer.reduce();
        return answer;
    }

    public static Fraction div(Fraction a, Fraction b) {
        int n = a.getNum() * b.getDenom();
        int d = a.getDenom() * b.getNum();
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

    public static Fraction minus(Fraction a, Fraction b) {
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
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0)
            return b;
        if (b == 0)
            return a;

        while (a != b) {
            if (a > b)
                a -= b;
            if (a < b)
                b -= a;
        }
        return a;
    }
}
