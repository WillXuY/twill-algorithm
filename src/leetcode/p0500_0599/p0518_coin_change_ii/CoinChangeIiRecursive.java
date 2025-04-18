package leetcode.p0500_0599.p0518_coin_change_ii;

import java.util.Arrays;

public class CoinChangeIiRecursive implements CoinChangeIi {
    @Override
    public int change(int amount, int[] coins) {
        if (amount == 0) {
            return 1;
        }
        Arrays.sort(coins);
        return recursive(amount, coins);
    }

    private int recursive(int amount, int[] sortedCoins) {
        int result = 0;
        for (int i = 0; i < sortedCoins.length; i++) {
            if (amount == sortedCoins[i]) {
                result++;
            } else if (amount > sortedCoins[i]) {
                int diff = amount - sortedCoins[i];
                result += recursive(diff, Arrays.copyOf(sortedCoins, i + 1));
            }
        }
        return result;
    }
}
