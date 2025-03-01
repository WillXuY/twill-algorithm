package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.SignOfTheProductOfAnArrayLoop;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class SignOfTheProductOfAnArrayTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[] {-1, -2, -3, -4, 3, 2, 1}, 1),
                arguments(new int[] {1, 5, 0, 2, -3}, 0),
                arguments(new int[] {-1, 1, -1, 1, -1}, -1)
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(int[] nums, int expected) {
        SignOfTheProductOfAnArray loop = new SignOfTheProductOfAnArrayLoop();
        assertEquals(expected, loop.arraySign(nums));
    }
}
