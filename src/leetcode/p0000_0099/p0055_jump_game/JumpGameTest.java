package leetcode.p0000_0099.p0055_jump_game;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class JumpGameTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[] {2, 0, 0}, true),
                arguments(new int[] {0}, true),
                arguments(new int[] {2, 3, 1, 1, 4}, true),
                arguments(new int[] {3, 2, 1, 0, 4}, false)
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(int[] nums, boolean expected) {
        JumpGame loop = new JumpGameLoop();
        assertEquals(expected, loop.canJump(nums));
    }
}
