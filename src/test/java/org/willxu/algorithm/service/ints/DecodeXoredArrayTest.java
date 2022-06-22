package org.willxu.algorithm.service.ints;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.ints.DecodeXoredArrayLoop;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class DecodeXoredArrayTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[] {1, 2, 3}, 1, new int[] {1, 0, 2, 1}),
                arguments(new int[] {6, 2, 7, 3}, 4, new int[] {4, 2, 0, 7, 4})
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(int[] encoded, int first, int[] excepted) {
        DecodeXoredArray loop = new DecodeXoredArrayLoop();
        assertArrayEquals(excepted, loop.decode(encoded, first));
    }
}
