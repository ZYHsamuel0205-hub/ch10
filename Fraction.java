public class Fraction {
    // instance variable (atrributes, fields)

    int numerator, denominator;

    // constructors
    public Fraction() { // default constructor (no parameter)
        numerator = 1;
        denominator = 1;
    }

    public Fraction(int n, int d) { // parameterized constructor
        numerator = n;
        denominator = d;
    }

    // behaviour methods (accessor, mutator, helper)
    public int getNum() { // accessor method, aka getters
        return numerator;
    }

    public int getDenom() { // accessor method
        return denominator;
    }
}
