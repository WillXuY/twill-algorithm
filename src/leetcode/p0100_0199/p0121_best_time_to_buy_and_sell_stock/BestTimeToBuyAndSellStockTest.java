/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package leetcode.p0100_0199.p0121_best_time_to_buy_and_sell_stock;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class BestTimeToBuyAndSellStockTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                /*
                Explanation: Buy on day 2 (price = 1) and sell on day 5
                (price = 6), profit = 6-1 = 5.
                Note that buying on day 2 and selling on day is not
                allowed because you must by before you sell.
                 */
                arguments(
                        new int[] {7, 1, 5, 3, 6, 4},
                        5
                ),
                /*
                Explanation: In this case, no transactions are done and
                the max profit = 0.
                 */
                arguments(
                        new int[] {7, 6, 4, 3, 1},
                        0
                )
        );
    }

    @ParameterizedTest(name = "Cycle {index}")
    @MethodSource("dataProvider")
    public void testCycle(int[] input, int expected) {
        BestTimeToBuyAndSellStock cycle = new BestTimeToBuyAndSellStockCycle();
        assertEquals(expected, cycle.maxProfit(input));
    }

    @ParameterizedTest(name = "Save min {index}")
    @MethodSource("dataProvider")
    public void testSaveMin(int[] input, int expected) {
        BestTimeToBuyAndSellStock cycle =
                new BestTimeToBuyAndSellStockSaveMin();
        assertEquals(expected, cycle.maxProfit(input));
    }
}
