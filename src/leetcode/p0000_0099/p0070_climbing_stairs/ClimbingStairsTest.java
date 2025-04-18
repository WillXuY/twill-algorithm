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
import org.willxu.algorithm.service.impl.integer.ClimbingStairsBruteForce;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class ClimbingStairsTest {

    static Stream<Arguments> dataProvider() {
        return Stream.of(
                /*
                Explanation:
                There two ways to climb to the top.
                1. 1 step + 1 step
                2. 2 steps
                 */
                arguments(2, 2),
                /*
                Explanation:
                There are three ways to climb to the top.
                1. 1 step + 1 step + 1 step
                2. 1 step + 2 steps
                3. 2 steps + 1 step
                 */
                arguments(3, 3),
                arguments(6, 13),
                arguments(7, 21),
                /*
                Wrong answer 1: / by 0
                 */
                arguments(35, 14930352),
                /*
                Wrong answer 2: 923305262
                 */
                arguments(44, 1134903170),
                /*
                test the range of long
                 */
                arguments(45, 1836311903)
        );
    }

    @ParameterizedTest(name = "Param {index}")
    @MethodSource("dataProvider")
    public void testClimbingStairs(int input, int output) {
        ClimbingStairs climbingStairs = new ClimbingStairsBruteForce();
        assertEquals(output, climbingStairs.climbStairs(input));
    }
}
