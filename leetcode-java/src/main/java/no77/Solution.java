package no77;

/**
 * @author boyiren
 * @date 2019-11-10
 */
public class Solution {
    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }

        int first = 1;
        int second = 2;
        for (int i = 3; i <= n; i++) {
            int third = first + second;
            first = second;
            second = third;
        }
        return second;
    }
}
