/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.string;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.string.ExcelSheetColumnRecursive;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class ExcelSheetColumnTitleTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                // Wrong answer 2, divide are wrong
                arguments(52, "AZ"),
                // Wrong answer 1
                arguments(26, "Z"),
                arguments(1, "A"),
                arguments(28, "AB"),
                arguments(701, "ZY"),
                arguments(2147483647, "FXSHRXW")
        );
    }

    @ParameterizedTest(name = "Recursive {index}")
    @MethodSource("dataProvider")
    public void testRecursive(int input, String expected) {
        ExcelSheetColumnTitle recursive = new ExcelSheetColumnRecursive();
        assertEquals(expected, recursive.convertToTitle(input));
    }
}
