/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package leetcode.p0800_0899.p0860_lemonade_change;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class LemonadeChangeTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[] {5, 5, 5, 10, 20}, true),
                arguments(new int[] {5, 5, 10, 10, 20}, false),
                arguments(new int[] {5, 5, 10}, true),
                arguments(new int[] {10, 10}, false)
        );
    }

    @ParameterizedTest(name = "Count {index}")
    @MethodSource("dataProvider")
    public void testCount(int[] bills, boolean expected) {
        LemonadeChange count = new LemonadeChangeCount();
        assertEquals(expected, count.lemonadeChange(bills));
    }
}
