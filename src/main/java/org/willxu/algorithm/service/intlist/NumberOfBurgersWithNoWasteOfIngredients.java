package org.willxu.algorithm.service.intlist;

import java.util.List;

public interface NumberOfBurgersWithNoWasteOfIngredients {
    /**
     * Given two integers tomatoSlices and cheeseSlices. The ingredients
     * of different burgers are as follows:
     * <p>
     * - Jumbo Burger: 4 tomato slices and 1 cheese slice.
     * - Small Burger: 2 Tomato slices and 1 cheese slice.
     * <p>
     * Return [total_jumbo, total_small] so that the number of remaining
     * tomatoSlices equal to 0 and the number of remaining cheeseSlices
     * equal to 0. If it is not possible to make the remaining
     * tomatoSlices and cheeseSlices equal to 0 return [].
     *
     * @param tomatoSlices,cheeseSlices 0 <= tomatoSlices, cheeseSlices <= 10^7
     */
    List<Integer> numOfBurgers(int tomatoSlices, int cheeseSlices);
}
