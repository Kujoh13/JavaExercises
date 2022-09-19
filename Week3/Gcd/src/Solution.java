import static java.lang.Math.abs;

public class Solution {
    /** Tim ucln. */
    public int gcd(int a, int b) {
        if (b == 0) {
            return abs(a);
        }
        return gcd(b, a % b);
    }
}
