package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.MinimumMovesToConvertStringSkip;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class MinimumMovesToConvertStringTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments("XXX", 1),
                arguments("XXOX", 2),
                arguments("OOOO", 0)
        );
    }

    @ParameterizedTest(name = "Skip {index}")
    @MethodSource("dataProvider")
    public void testSkip(String s, int excepted) {
        MinimumMovesToConvertString skip =
                new MinimumMovesToConvertStringSkip();
        assertEquals(excepted, skip.minimumMoves(s));
    }
}
