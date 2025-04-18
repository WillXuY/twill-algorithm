/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package leetcode.p0700_0799.p0717_one_bit_and2_bit_characters;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class OneBitAnd2BitCharactersTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[] {0, 1, 1, 0}, true),
                arguments(new int[] {0, 1, 0}, false),
                arguments(new int[] {1, 1, 0}, true),
                // Wrong answer 2:
                arguments(new int[] {0, 0}, true),
                // Wrong answer 1:
                arguments(new int[] {0} ,true),
                arguments(new int[] {1, 0, 0}, true),
                arguments(new int[] {1, 1, 1, 0}, false)
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(int[] bits, boolean expected) {
        OneBitAnd2BitCharacters loop = new OneBitAnd2BitCharactersLoop();
        assertEquals(expected, loop.isOneBitCharacter(bits));
    }
}
