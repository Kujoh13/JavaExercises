public class Solution {
    private long[] fib = new long[101];

    /**
     * Tinh so fibonacci thu N.
     */
    public long fibonacci(long n) {
        if (n < 0) {
            return -1;
        }
        fib[0] = 0;
        fib[1] = 1;
        long res = Long.MAX_VALUE;
        if (n == 0) {
            res = 0;
        }
        if (n == 1) {
            res = 1;
        }
        for (int i = 2; i <= n; i++) {
            if (Long.MAX_VALUE - fib[i - 1] >= fib[i - 2]) {
                fib[i] = fib[i - 1] + fib[i - 2];
            } else {
                fib[i] = Long.MAX_VALUE;
            }
            if (fib[i] == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
            if ((long) i == n) {
                res = fib[i];
            }
        }
        return res;
    }
}
