package leetcode.p0400_0499.p0441_arranging_coins;

public class ArrangingCoinsCycle implements ArrangingCoins {
    @Override
    public int arrangeCoins(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) {
            count++;
            n = n - i;
        }
        return count;
    }
}
