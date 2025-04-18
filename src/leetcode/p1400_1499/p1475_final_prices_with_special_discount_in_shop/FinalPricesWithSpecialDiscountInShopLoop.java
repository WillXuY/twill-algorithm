package leetcode.p1400_1499.p1475_final_prices_with_special_discount_in_shop;

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
