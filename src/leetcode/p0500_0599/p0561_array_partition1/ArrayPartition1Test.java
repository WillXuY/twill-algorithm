/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package leetcode.p0500_0599.p0561_array_partition1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class ArrayPartition1Test {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                /*
                min(1, 2) + min(3, 4) == 1 + 3 = 4
                 */
                arguments(new int[] {1, 4, 3, 2}, 4),
                /*
                min(1, 2) + min(2, 5) + min(6, 6) = 1 + 2 + 6 = 9
                 */
                arguments(new int[] {6, 2, 6, 5, 1, 2}, 9)
        );
    }

    @ParameterizedTest(name = "Order {index}")
    @MethodSource("dataProvider")
    public void testOrder(int[] input, int expected) {
        ArrayPartition1 order = new ArrayPartition1Order();
        assertEquals(expected, order.arrayPairSum(input));
    }
}
