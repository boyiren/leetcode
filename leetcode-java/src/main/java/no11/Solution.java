package no11;

/**
 * @author boyiren
 * @date 2019-10-20
 */
public class Solution {
    public int maxArea(int[] height) {
        int i = 0;
        int j = height.length - 1;
        int res = 0;
        while (i < j) {
            res = height[i] < height[j] ?
                    Math.max(res, (j - i) * height[i++]):
                    Math.max(res, (j- i) * height[j--]);
        }
        return res;
    }
}
