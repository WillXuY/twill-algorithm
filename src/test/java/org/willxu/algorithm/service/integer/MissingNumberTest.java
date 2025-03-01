package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.MissingNumberRemove;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class MissingNumberTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                // the array must start with 0
                arguments(new int[] {1}, 0),
                arguments(new int[] {3, 0, 1}, 2),
                arguments(new int[] {0, 1}, 2),
                arguments(new int[] {9, 6, 4, 2, 3, 5, 7, 0, 1}, 8),
                arguments(new int[] {0}, 1)
        );
    }

    @ParameterizedTest(name = "Remove {index}")
    @MethodSource("dataProvider")
    public void testRemove(int[] input, int expected) {
        MissingNumber remove = new MissingNumberRemove();
        assertEquals(expected, remove.missingNumber(input));
    }
}
