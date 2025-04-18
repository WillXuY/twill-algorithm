/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package leetcode.p0800_0899.p0824_goat_latin;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class GoatLatinTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        "I speak Goat Latin",
                        "Imaa peaksmaaa oatGmaaaa atinLmaaaaa"
                ),
                arguments(
                        "The quick brown fox jumped over the lazy dog",
                        "heTmaa uickqmaaa rownbmaaaa oxfmaaaaa umpedjmaaaaaa "
                                + "overmaaaaaaa hetmaaaaaaaa azylmaaaaaaaaa "
                                + "ogdmaaaaaaaaaa"
                )
        );
    }

    @ParameterizedTest
    @MethodSource("dataProvider")
    public void testLoop(String sentence, String expected) {
        GoatLatin loop = new GoatLatinLoop();
        assertEquals(expected, loop.toGoatLatin(sentence));
    }
}
