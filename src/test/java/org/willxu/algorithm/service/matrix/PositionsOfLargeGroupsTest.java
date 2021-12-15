/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.matrix;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.matrix.PositionsOfLargeGroupsLoop;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class PositionsOfLargeGroupsTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        "aaa",
                        Stream.of(
                                Stream.of(
                                        0, 2
                                ).collect(Collectors.toList())
                        ).collect(Collectors.toList())
                ),
                arguments(
                        "abbxxxxzzy",
                        Stream.of(
                                Stream.of(
                                        3, 6
                                ).collect(Collectors.toList())
                        ).collect(Collectors.toList())
                ),
                arguments("abc", Collections.emptyList()),
                arguments(
                        "abcdddeeeeaabbbcd",
                        Stream.of(
                                Stream.of(
                                        3, 5
                                ).collect(Collectors.toList()),
                                Stream.of(
                                        6, 9
                                ).collect(Collectors.toList()),
                                Stream.of(
                                        12, 14
                                ).collect(Collectors.toList())
                        ).collect(Collectors.toList())
                ),
                arguments("aba", Collections.emptyList())
        );
    }

    @ParameterizedTest
    @MethodSource("dataProvider")
    public void testLoop(String s, List<List<Integer>> excepted) {
        PositionsOfLargeGroups loop = new PositionsOfLargeGroupsLoop();
        assertEquals(excepted.toString(),
                loop.largeGroupPositions(s).toString());
    }
}
