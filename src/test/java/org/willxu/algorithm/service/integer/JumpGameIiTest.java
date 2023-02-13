package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.JumpGameIiLoop;
import org.willxu.algorithm.service.impl.integer.JumpGameIiRange;
import org.willxu.algorithm.service.impl.integer.JumpGameIiSkip;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class JumpGameIiTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[] {1, 1, 1, 1}, 3),
                arguments(new int[] {1, 2}, 1),
                arguments(new int[] {2, 3, 1, 1, 4}, 2),
                arguments(new int[] {1, 2, 3}, 2),
                arguments(new int[] {0}, 0),
                arguments(new int[] {2, 3, 1, 1, 4}, 2),
                arguments(new int[] {2, 3, 0, 1, 4}, 2)
        );
    }

    @ParameterizedTest(name = "Skip {index}")
    @MethodSource("dataProvider")
    public void testSkip(int[] nums, int excepted) {
        JumpGameIi skip = new JumpGameIiSkip();
        assertEquals(excepted, skip.jump(nums));
    }

    @ParameterizedTest(name = "Range {index}")
    @MethodSource("dataProvider")
    public void testRange(int[] nums, int excepted) {
        JumpGameIi range = new JumpGameIiRange();
        assertEquals(excepted, range.jump(nums));
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(int[] nums, int excepted) {
        JumpGameIi loop = new JumpGameIiLoop();
        assertEquals(excepted, loop.jump(nums));
    }
}
