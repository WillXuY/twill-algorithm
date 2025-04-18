package org.willxu.algorithm.service.ints;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.ints.ConcatenationOfArrayCopy;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class ConcatenationOfArrayTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[] {1, 2, 1}, new int[] {1, 2, 1, 1, 2, 1}),
                arguments(
                        new int[] {1, 3, 2, 1},
                        new int[] {1, 3, 2, 1, 1, 3, 2, 1}
                )
        );
    }

    @ParameterizedTest(name = "Copy {index}")
    @MethodSource("dataProvider")
    public void testCopy(int[] nums, int[] expected) {
        ConcatenationOfArray copy = new ConcatenationOfArrayCopy();
        assertArrayEquals(expected, copy.getConcatenation(nums));
    }
}
