package leetcode.p1400_1499.p1475_final_prices_with_special_discount_in_shop;

public interface FinalPricesWithSpecialDiscountInShop {
    /**
     * Given the array prices where prices[i] is the price of the ith
     * item in a shop. There is a special discount for items in the
     * shop, if you buy the ith item, then you will receive a discount
     * equivalent to prices[j] where j is the minimum index such that
     * j > i and prices[j] <= prices[i], otherwise, you will not receive
     * any discount at all.
     *
     * Return an array where the ith element is the final price you will
     * pay for the ith item of the shop considering the special
     * discount.
     *
     * @param prices 1 <= prices.length <= 500
     *               1 <= prices[i] <= 10^3
     */
    int[] finalPrices(int[] prices);
}
