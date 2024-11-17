package org.willxu.algorithm.service.intlist;

import java.util.List;

public interface FilterRestaurantsByVeganFriendlyPriceAndDistance {
    /**
     * Given the array restaurants where restaurants[i] =
     * [id_i, rating_i, veganFriendly_i, price_i, distance_i]. You have
     * to filter the restaurants using three filters.
     * <p>
     * The veganFriendly filter will be either true (meaning you should
     * only include restaurants with veganFriendly_i set to true) or
     * false (meaning you can include any restaurant). In addition, you
     * have the filters maxPrice and maxDistance which are the maximum
     * value for price and distance of restaurants you should consider
     * respectively.
     * <p>
     * Return the array of restaurant IDs after filtering, ordered by
     * rating from highest to lowest. For restaurants with the same
     * rating, order them by id from highest to lowest. For simplicity
     * veganFriendly_i and veganFriendly take value 1 when it is true,
     * and 0 when it is false.
     *
     * @param restaurants 1 <= restaurants.length <= 10^4
     *                    restaurants[i].length == 5
     *                    1 <= id_i, rating_i, price_i, distance_i <= 10^5
     *                    All id_i are distinct.
     * @param veganFriendly veganFriendly_i and veganFriendly are 0 or 1.
     * @param maxPrice,maxDistance 1 <= maxPrice, maxDistance <= 10^5
     */
    List<Integer> filterRestaurants(int[][] restaurants, int veganFriendly,
                                    int maxPrice, int maxDistance);
}
