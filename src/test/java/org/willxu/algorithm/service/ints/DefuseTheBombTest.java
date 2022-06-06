package org.willxu.algorithm.service.ints;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.ints.DefuseTheBombLoop;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class DefuseTheBombTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        new int[] {5, 7, 1, 4},
                        3,
                        new int[] {12, 10, 16, 13}
                ),
                arguments(new int[] {1, 2, 3, 4}, 0, new int[] {0, 0, 0, 0}),
                arguments(new int[] {2, 4, 9, 3}, -2, new int[] {12, 5, 6, 13})
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(int[] code, int k, int[] excepted) {
        DefuseTheBomb loop = new DefuseTheBombLoop();
        assertArrayEquals(excepted, loop.decrypt(code, k));
    }
}
