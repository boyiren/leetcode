package no509;

/**
 * @author boyiren
 * @date 2019-11-11
 */
public class Solution {
    public int fib(int n) {
        if (n <= 1) {
            return n;
        }

        int x = 0, y = 1, result = 0;
        for (int i = 2; i <= n; i++) {
            result = x + y;
            x = y;
            y = result;
        }
        return result;
    }
}
