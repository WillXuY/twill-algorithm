package org.willxu.algorithm.service.ints;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.ints.ConstructTheRectangleSqrt;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class ConstructTheRectangleTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(4, new int[] {2, 2}),
                arguments(37, new int[] {37, 1}),
                arguments(122122, new int[] {427, 286})
        );
    }

    @ParameterizedTest(name = "Sqrt {index}")
    @MethodSource("dataProvider")
    public void testSqrt(int input, int[] excepted) {
        ConstructTheRectangle sqrt = new ConstructTheRectangleSqrt();
        assertArrayEquals(excepted, sqrt.constructRectangle(input));
    }
}
