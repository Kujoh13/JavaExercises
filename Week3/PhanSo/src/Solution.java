import static java.lang.Math.abs;

public class Solution {
    private int numerator;
    private int denominator;

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    /** Set tu so. */
    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    /** Set mau so. */
    public void setDenominator(int denominator) {
        if (denominator != 0) {
            this.denominator = denominator;
        }
    }

    /** Khoi tao phan so voi 2 gia tri. */
    public Solution(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = 1;
        if (denominator != 0) {
            this.denominator = denominator;
        }
    }

    /** Khoi tao phan so. */
    public Solution() {
        numerator = 0;
        denominator = 1;
    }

    /** Tim ucln. */
    public int gcd(int a, int b) {
        if (b == 0) {
            return abs(a);
        }
        return gcd(b, a % b);
    }

    /** Rut gon phan so. */
    public Solution reduce() {
        int x = gcd(numerator, denominator);
        numerator /= x;
        denominator /= x;
        return this;
    }

    /** Cong phan so. */
    public Solution add(Solution x) {
        if (x.getDenominator() == 0) {
            return this;
        }
        int newNumerator = numerator * x.getDenominator() + denominator * x.getNumerator();
        int newDetominator = denominator * x.getDenominator();
        Solution res = new Solution(newNumerator, newDetominator);
        res.reduce();
        return res;
    }

    /** Tru phan so. */
    public Solution subtract(Solution x) {
        if (x.getDenominator() == 0) {
            return this;
        }
        int newNumerator = numerator * x.getDenominator() - denominator * x.getNumerator();
        int newDetominator = denominator * x.getDenominator();
        Solution res = new Solution(newNumerator, newDetominator);
        res.reduce();
        return res;
    }

    /** Nhan phan so. */
    public Solution multiply(Solution x) {
        if (x.getDenominator() == 0) {
            return this;
        }
        int newNumerator = numerator * x.getNumerator();
        int newDetominator = denominator * x.getDenominator();
        Solution res = new Solution(newNumerator, newDetominator);
        res.reduce();
        return res;
    }

    /** Chia phan so. */
    public Solution divide(Solution x) {
        if (x.getDenominator() == 0) {
            return this;
        }
        int newNumerator = numerator * x.getDenominator();
        int newDetominator = denominator * x.getNumerator();
        if (newDetominator != 0) {
            Solution res = new Solution(newNumerator, newDetominator);
            res.reduce();
            return res;
        }
        return this;
    }

    /** Kiem tra phan so voi object. */
    public boolean equals(Object obj) {
        if (obj instanceof Solution) {
            Solution other = (Solution) obj;
            this.reduce();
            other.reduce();
            if (other.getNumerator() == numerator && other.getDenominator() == denominator) {
                return true;
            }
            return false;
        }
        return false;
    }
}
