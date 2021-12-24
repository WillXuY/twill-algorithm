/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.bool;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.bool.LemonadeChangeCount;

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
    public void testCount(int[] bills, boolean excepted) {
        LemonadeChange count = new LemonadeChangeCount();
        assertEquals(excepted, count.lemonadeChange(bills));
    }
}
