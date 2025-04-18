package org.willxu.algorithm.service.impl.ints;

import org.willxu.algorithm.service.ints.FinalPricesWithSpecialDiscountInShop;

public class FinalPricesWithSpecialDiscountInShopLoop
        implements FinalPricesWithSpecialDiscountInShop {
    @Override
    public int[] finalPrices(int[] prices) {
        int[] output = new int[prices.length];
        for (int i = 0; i < output.length; i++) {
            output[i] = -1;
            for (int j = i + 1; j < output.length; j++) {
                if (prices[j] <= prices[i]) {
                    output[i] = prices[i] - prices[j];
                    break;
                }
            }
            if (output[i] == -1) {
                output[i] = prices[i];
            }
        }
        return output;
    }
}
