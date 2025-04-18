/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package leetcode.p0300_0399.p0312_burst_balloons;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class BurstBalloonsTest {
    /**
     * Example:
     * Input: [3, 1, 5, 8]
     * Output: 167
     * Explanation: nums = [3, 1, 5, 8] --> [3, 5, 8] --> [3, 8] --> [8] --> []
     *             coins =   3*1*5      +     3*5*8   +  1*3*8   +  1*8*1 = 167
     */
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[] {3, 1, 5, 8}, 167),
                arguments(new int[] {1, 5}, 10)
        );
    }

    @ParameterizedTest(name = "Brute force {index}")
    @MethodSource("dataProvider")
    public void testGetBurstBalloons(int[] input, int output) {
        BurstBalloons wrong = new BurstBalloonsWrong();
        assertEquals(output, wrong.maxCoins(input));
    }
}
