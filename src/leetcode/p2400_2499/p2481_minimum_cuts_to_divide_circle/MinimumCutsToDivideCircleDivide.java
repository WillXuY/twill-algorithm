package leetcode.p2400_2499.p2481_minimum_cuts_to_divide_circle;

public class MinimumCutsToDivideCircleDivide
        implements MinimumCutsToDivideCircle {
    @Override
    public int numberOfCuts(int n) {
        if (n == 1) {
            return 0;
        }
        if ((n & 1) == 0) {
            n /= 2;
        }
        return n;
    }
}
