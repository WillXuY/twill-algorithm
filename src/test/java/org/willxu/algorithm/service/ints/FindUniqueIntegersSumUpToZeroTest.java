package org.willxu.algorithm.service.ints;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.ints.FindUniqueIntegersSumUpToZeroSymmetry;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class FindUniqueIntegersSumUpToZeroTest {
    static Stream<Arguments> dataProviderSymmetry() {
        return Stream.of(
                arguments(5, new int[] {1, 2, 0, -2, -1}),
                arguments(3, new int[] {1, 0, -1}),
                arguments(1, new int[] {0})
        );
    }

    @ParameterizedTest(name = "Symmetry {index}")
    @MethodSource("dataProviderSymmetry")
    public void testSymmetry(int n, int[] expected) {
        FindUniqueIntegersSumUpToZero symmetry =
                new FindUniqueIntegersSumUpToZeroSymmetry();
        assertArrayEquals(expected, symmetry.sumZero(n));
    }
}
