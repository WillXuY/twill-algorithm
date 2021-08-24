package org.willxu.algorithm.service.empty;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.empty.MoveZerosExchange;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class MoveZerosTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        new int[] {0, 1, 0, 3, 12},
                        new int[] {1, 3, 12, 0, 0}
                ),
                arguments(
                        new int[] {0},
                        new int[] {0}
                )
        );
    }

    @ParameterizedTest(name = "Exchange {index}")
    @MethodSource("dataProvider")
    public void testExchange(int[] input, int[] excepted) {
        MoveZeros exchange = new MoveZerosExchange();
        exchange.moveZeroes(input);
        assertArrayEquals(excepted, input);
    }
}
