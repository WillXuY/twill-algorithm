/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package leetcode.p0700_0799.p0748_shortest_completing_word;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class ShortestCompletingWordTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        "1s3 PSt",
                        new String[] {"step", "steps", "stripe", "stepple"},
                        "stepple"
                ),
                arguments(
                        "1s3 456",
                        new String[] {"looks", "pest", "stew", "show"},
                        "pest"
                ),
                arguments(
                        "Ah71752",
                        new String[] {
                                "suggest", "letter", "of", "husband", "easy",
                                "education", "drug", "prevent", "writer", "old"
                        },
                        "husband"
                ),
                arguments(
                        "OgEu755",
                        new String[] {
                                "enough", "these", "play", "wide", "wonder",
                                "box", "arrive", "money", "tax", "thus"
                        },
                        "enough"
                ),
                arguments(
                        "iMSlpe4",
                        new String[] {
                                "claim", "consumer", "student", "camera",
                                "public", "never", "wonder", "simple",
                                "thought", "use"
                        },
                        "simple"
                )
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(String plate, String[] words, String expected) {
        ShortestCompletingWord loop = new ShortestCompletingWordLoop();
        assertEquals(expected, loop.shortestCompletingWord(plate, words));
    }

    @Test
    public void testCharLowercase() {
        // 32
        System.out.println('a' - 'A');
    }
}
