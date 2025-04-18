package leetcode.p0000_0099.p0045_jump_game_ii;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

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
    public void testSkip(int[] nums, int expected) {
        JumpGameIi skip = new JumpGameIiSkip();
        assertEquals(expected, skip.jump(nums));
    }

    @ParameterizedTest(name = "Range {index}")
    @MethodSource("dataProvider")
    public void testRange(int[] nums, int expected) {
        JumpGameIi range = new JumpGameIiRange();
        assertEquals(expected, range.jump(nums));
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(int[] nums, int expected) {
        JumpGameIi loop = new JumpGameIiLoop();
        assertEquals(expected, loop.jump(nums));
    }
}
