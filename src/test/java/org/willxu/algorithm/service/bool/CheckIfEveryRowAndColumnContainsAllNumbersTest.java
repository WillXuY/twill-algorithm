package org.willxu.algorithm.service.bool;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.bool.CheckIfEveryRowAndColumnContainsAllNumbersLoop;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CheckIfEveryRowAndColumnContainsAllNumbersTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[][] {{1, 2, 3}, {3, 1, 2}, {2, 3, 1}}, true),
                arguments(new int[][] {{1, 1, 1}, {1, 2, 3}, {1, 2, 3}}, false)
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(int[][] matrix, boolean excepted) {
        CheckIfEveryRowAndColumnContainsAllNumbers loop =
                new CheckIfEveryRowAndColumnContainsAllNumbersLoop();
        assertEquals(excepted, loop.checkValid(matrix));
    }
}
