/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.BaseballGameList;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class BaseballGameTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                /*
                "5" - Add 5 to the record, record is now [5].
                "2" - Add 2 to the record, record is now [5, 2].
                "C" - Invalidate and remove the previous score, record
                      is now [5].
                "D" - Add 2 * 5 = 10 to the record, record is now
                      [5, 10].
                "+" - Add 5 + 10 = 15 to the record, record is now
                      [5, 10, 15].
                The total sum is 30.
                 */
                arguments(new String[] {"5", "2", "C", "D", "+"}, 30),
                arguments(
                        new String[] {"5", "-2", "4", "C", "D", "9", "+", "+"},
                        27
                ),
                arguments(new String[] {"1"}, 1)
        );
    }

    @ParameterizedTest(name = "List {index}")
    @MethodSource("dataProvider")
    public void testList(String[] input, int expected) {
        BaseballGame list = new BaseballGameList();
        assertEquals(expected, list.calPoints(input));
    }
}
