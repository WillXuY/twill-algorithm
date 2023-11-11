package org.willxu.algorithm.service.integer;

import java.util.List;

public interface ShoppingOffers {
    /**
     * In LeetCode Store, there are n items to sell. Each item has a
     * price. However, there are some special offers, and a special
     * offer consists of one or more different kinds of items with a
     * sale price.
     * <p>
     * You are given an integer array price where price[i] is the price
     * of the i^th item, and an integer array needs where needs[i] is
     * the number of pieces of the i^th item you want to buy.
     * <p>
     * You are also given an array special where special[i] is of size
     * n + 1 where special[i][j] is the number of pieces of the j^th
     * item in the i^th offer and special[i][n] (i.e., the last integer
     * in the array) is the price of the i^th offer.
     * <p>
     * Return the lowest price you have to pay for exactly certain items
     * as given, where you could make optimal use of the special offers.
     * You are not allowed to buy more items than you want, even if that
     * would lower the overall price. You could use any of the special
     * offers as many times as you want.
     *
     * @param price,needs n == price.length == needs.length
     *                    1 <= n <= 6
     *                    0 <= price[i], needs[i] <= 10
     * @param special 1 <= special.length <= 100
     *                special[i].length == n + 1
     *                0 <= special[i][j] <= 50
     */
    int shoppingOffers(List<Integer> price,
                       List<List<Integer>> special,
                       List<Integer> needs);
}
