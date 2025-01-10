package org.willxu.algorithm.service.bool;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.bool.CheckIfAllAsAppearsBeforeAllBsLoop;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CheckIfAllAsAppearsBeforeAllBsTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments("aaabbb", true),
                arguments("abab", false),
                arguments("bbb", true)
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(String s, boolean excepted) {
        CheckIfAllAsAppearsBeforeAllBs loop =
                new CheckIfAllAsAppearsBeforeAllBsLoop();
        assertEquals(excepted, loop.checkString(s));
    }
}
