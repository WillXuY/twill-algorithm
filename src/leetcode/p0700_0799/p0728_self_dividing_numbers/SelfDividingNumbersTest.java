/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package leetcode.p0700_0799.p0728_self_dividing_numbers;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class SelfDividingNumbersTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        1, 22,
                        Stream.of(
                                1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 12, 15, 22
                        ).collect(Collectors.toList())
                ),
                arguments(
                        47, 85,
                        Stream.of(48, 55, 66, 77).collect(Collectors.toList())
                )
        );
    }

    @ParameterizedTest(name = "Divide {index}")
    @MethodSource("dataProvider")
    public void testDivide(int left, int right, List<Integer> expected) {
        SelfDividingNumbers divide = new SelfDividingNumbersDivide();
        assertArrayEquals(expected.toArray(),
                divide.selfDividingNumbers(left, right).toArray());
    }
}
