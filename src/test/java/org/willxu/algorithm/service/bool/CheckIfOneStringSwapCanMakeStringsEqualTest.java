package org.willxu.algorithm.service.bool;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.bool.CheckIfOneStringSwapCanMakeStringsEqualLoop;

import java.util.stream.Stream;

import static org.gradle.internal.impldep.org.junit.Assert.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CheckIfOneStringSwapCanMakeStringsEqualTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        "gasitigykqhrtnypjbeqwwsngclzr",
                        "gasitigykqhrtnypjbeqwwsngczlr",
                        true
                ),
                arguments("bank", "kanb", true),
                arguments("attack", "defend", false),
                arguments("kelb", "kelb", true)
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(String s1, String s2, boolean excepted) {
        CheckIfOneStringSwapCanMakeStringsEqual loop =
                new CheckIfOneStringSwapCanMakeStringsEqualLoop();
        assertEquals(excepted, loop.areAlmostEqual(s1, s2));
    }
}
