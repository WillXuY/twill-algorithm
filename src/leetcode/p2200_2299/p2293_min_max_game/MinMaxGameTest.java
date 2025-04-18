package leetcode.p2200_2299.p2293_min_max_game;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class MinMaxGameTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[] {1,3,5,2,4,8,2,2}, 1),
                arguments(new int[] {3}, 3)
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(int[] nums, int expected) {
        MinMaxGame loop = new MinMaxGameLoop();
        assertEquals(expected, loop.minMaxGame(nums));
    }
}
