package org.willxu.algorithm.service.string;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.string.DecodeTheMessageMap;

import java.util.stream.Stream;

import static org.gradle.internal.impldep.org.junit.Assert.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class DecodeTheMessageTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        "the quick brown fox jumps over the lazy dog",
                        "vkbs bs t suepuv",
                        "this is a secret"
                ),
                arguments(
                        "eljuxhpwnyrdgtqkviszcfmabo",
                        "zwx hnfx lqantp mnoeius ycgk vcnjrdb",
                        "the five boxing wizards jump quickly"
                )
        );
    }

    @ParameterizedTest(name = "Map {index}")
    @MethodSource("dataProvider")
    public void testMap(String key, String message, String excepted) {
        DecodeTheMessage map = new DecodeTheMessageMap();
        assertEquals(excepted, map.decodeMessage(key, message));
    }
}
