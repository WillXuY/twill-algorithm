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
import org.willxu.algorithm.service.impl.integer.ExcelSheetColumnNumberAdd;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class ExcelSheetColumnNumberTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments("A", 1),
                arguments("AB", 28),
                arguments("ZY", 701),
                arguments("FXSHRXW", 2147483647)
        );
    }

    @ParameterizedTest(name = "Add {index}")
    @MethodSource("dataProvider")
    public void testAdd(String input, int excepted) {
        ExcelSheetColumnNumber add = new ExcelSheetColumnNumberAdd();
        assertEquals(excepted, add.titleToNumber(input));
    }
}
