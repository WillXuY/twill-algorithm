package leetcode.p0400_0499.p0441_arranging_coins;

public class ArrangingCoinsEquation implements ArrangingCoins {
    /**
     * n = items number.
     * s = sum of items.
     * l = last item.
     * f = first item = 1.
     * t = tolerance = 1.
     *
     * (f + l) * n / 2 = s;
     * (l - f) / t + 1 = n;
     *
     * 2s = (1 + l) * n;
     * l = n;
     *
     * 2s = (1 + n) * n;
     * n^2 + n - 2s = 0
     *
     * a = 1, b = 1, c = -2s
     * b^2 - 4ac = 1 + 8s
     *
     * n = (-1 + (1 + 8s)^(1/2)) / 2
     *
     * @param n 1 <= n <= 2^31 - 1
     * @return equation positive root.
     */
    @Override
    public int arrangeCoins(int n) {
        double root_b2_4ac = Math.sqrt(8.0 * n + 1);
        double x1 = (root_b2_4ac - 1) / 2;
        return (int) x1;
    }
}
