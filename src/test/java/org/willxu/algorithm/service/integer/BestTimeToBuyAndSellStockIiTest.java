/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.BestTimeToBuyAndSellStockIiGreedy;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class BestTimeToBuyAndSellStockIiTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                // Wrong answer 4
                arguments(
                        new int[] {5, 2, 3, 2, 6, 6, 2, 9, 1, 0, 7, 4, 5, 0},
                        20
                ),
                // Wrong answer 3
                arguments(
                        new int[] {3, 3, 5, 0, 0, 3, 1, 4},
                        8
                ),
                // Wrong answer 2
                arguments(
                        new int[] {2, 1, 4},
                        3
                ),
                // Wrong answer 1
                arguments(
                        new int[] {1, 4, 2},
                        3
                ),
                /*
                Explanation: Buy on day 2 (price = 1) and sell on day 3
                (price = 5), profit = 5 - 1 = 4.
                Then buy on day 4 (price = 3) and sell on day 5
                (price = 6), profit = 6 - 3 = 3.
                 */
                arguments(
                        new int[] {7, 1, 5, 3, 6, 4},
                        7
                ),
                /*
                Explanation: Buy on day 1 (price = 1) and sell on day 5
                (price = 5), profit = 5 - 1 = 4.
                Note that you cannot buy on day 1, buy on day 2 and
                sell them later, as you are engaging multiple
                transactions at the same time. You must sell before you
                buying again.
                 */
                arguments(
                        new int[] {1, 2, 3, 4, 5},
                        4
                ),
                /*
                Explanation: In this case, no transaction is done.
                i.e., max profit = 0.
                 */
                arguments(
                        new int[] {7, 6, 4, 3, 1},
                        0
                )
        );
    }

    @ParameterizedTest(name = "Greedy {index}")
    @MethodSource("dataProvider")
    public void testGreedy(int[] input, int excepted) {
        BestTimeToBuyAndSellStockIi greedy =
                new BestTimeToBuyAndSellStockIiGreedy();
        assertEquals(excepted, greedy.maxProfit(input));
    }
}
