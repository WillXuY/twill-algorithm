/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package leetcode.p0700_0799.p0771_jewels_and_stones;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class JewelsAndStonesTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments("aA", "aAAbbbb", 3),
                arguments("z", "ZZ", 0)
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(String jewels, String stones, int expected) {
        JewelsAndStones loop = new JewelsAndStonesLoop();
        assertEquals(expected, loop.numJewelsInStones(jewels, stones));
    }
}
