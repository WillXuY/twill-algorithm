/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package leetcode.p0100_0199.p0119_pascals_triangle_ii;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class PascalsTriangleIiTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(3, Stream.of(
                        1, 3, 3, 1
                ).collect(Collectors.toList())),
                arguments(0, Stream.of(
                        1
                ).collect(Collectors.toList())),
                arguments(1, Stream.of(
                        1, 1
                ).collect(Collectors.toList()))
        );
    }

    @ParameterizedTest(name = "Recursive {index}")
    @MethodSource("dataProvider")
    public void testRecursive(int input, List<Integer> expected)
            throws JsonProcessingException {
        PascalsTriangleIi recursive = new PascalsTriangleIiRecursive();
        ObjectMapper mapper = new ObjectMapper();
        String output = mapper.writeValueAsString(recursive.getRow(input));
        assertEquals(mapper.writeValueAsString(expected), output);
    }
}
