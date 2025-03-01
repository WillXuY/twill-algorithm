/*
 * Copyright (C) 2021 Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.strlist;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.strlist.SummaryRangesCycle;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class SummaryRangesTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        new int[] {0, 1, 2, 4, 5, 7},
                        Stream.of("0->2", "4->5", "7")
                                .collect(Collectors.toList())
                ),
                arguments(
                        new int[] {0, 2, 3, 4, 6, 8, 9},
                        Stream.of("0", "2->4", "6", "8->9")
                                .collect(Collectors.toList())
                ),
                arguments(
                        new int[0],
                        Collections.emptyList()
                ),
                arguments(
                        new int[] {-1},
                        Stream.of("-1").collect(Collectors.toList())
                ),
                arguments(
                        new int[] {0},
                        Stream.of("0").collect(Collectors.toList())
                )
        );
    }

    @ParameterizedTest(name = "Cycle {index}")
    @MethodSource("dataProvider")
    public void testCycle(int[] input, List<String> expected)
            throws JsonProcessingException {
        SummaryRanges cycle = new SummaryRangesCycle();
        ObjectMapper objectMapper = new ObjectMapper();
        String expectedString = objectMapper.writeValueAsString(expected);
        assertEquals(expectedString,
                objectMapper.writeValueAsString(cycle.summaryRanges(input)));
    }
}
