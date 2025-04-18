/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package leetcode.p0800_0899.p0806_number_of_lines_to_write_string;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class NumberOfLinesToWriteStringTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        new int[] {
                                10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,
                                10,10,10,10,10,10,10,10,10,10,10
                        },
                        "abcdefghijklmnopqrstuvwxyz",
                        new int[] {3, 60}
                ),
                arguments(
                        new int[] {
                                4,10,10,10,10,10,10,10,10,10,10,10,10,10,10,
                                10,10,10,10,10,10,10,10,10,10,10
                        },
                        "bbbcccdddaaa",
                        new int[] {2, 4}
                )
        );
    }

    @ParameterizedTest
    @MethodSource("dataProvider")
    public void testLoop(int[] widths, String s, int[] expected) {
        NumberOfLinesToWriteString loop = new NumberOfLinesToWriteStringLoop();
        assertArrayEquals(expected, loop.numberOfLines(widths, s));
    }
}
