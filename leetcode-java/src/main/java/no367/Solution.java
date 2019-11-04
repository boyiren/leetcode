package no367;

/**
 * @author boyiren
 * @date 2019-11-04
 */
public class Solution {
    public boolean isPerfectSquare(int num) {
        long left = 1;
        long right = num;
        while (left <= right) {
            long mid = (left + right) / 2;
            long square = mid * mid;
            if (square == num) {
                return true;
            } else if (square > num) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return false;
    }
}
