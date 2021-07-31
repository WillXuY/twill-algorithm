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
import org.willxu.algorithm.service.impl.string.StringWithoutAaaOrBbbServiceImpl;
import org.willxu.algorithm.service.string.StringWithoutAaaOrBbbService;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class StringWithoutAaaOrBbbServiceTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(1, 2, "bab"),
                arguments(4, 1, "aabaa")
        );
    }

    @ParameterizedTest(name = "Brute force {index}")
    @MethodSource("dataProvider")
    public void testGetStringWithoutAaaOrBbbBruteForce(int a, int b, String output) {
        StringWithoutAaaOrBbbService bruteForce = new StringWithoutAaaOrBbbServiceImpl();
        assertEquals(output, bruteForce.getStringWithoutAaaOrBbb(a, b));
    }
}
