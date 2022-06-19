package org.willxu.algorithm.service.bool;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.bool.DetermineIfStringHalvesAreAlikeCount;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class DetermineIfStringHalvesAreAlikeTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments("book", true),
                arguments("textbook", false)
        );
    }

    @ParameterizedTest(name = "Count {index}")
    @MethodSource("dataProvider")
    public void testCount(String s, boolean excepted) {
        DetermineIfStringHalvesAreAlike count =
                new DetermineIfStringHalvesAreAlikeCount();
        assertEquals(excepted, count.halvesAreAlike(s));
    }
}
