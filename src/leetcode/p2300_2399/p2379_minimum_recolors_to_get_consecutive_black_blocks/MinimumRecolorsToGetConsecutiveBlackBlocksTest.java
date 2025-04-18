package leetcode.p2300_2399.p2379_minimum_recolors_to_get_consecutive_black_blocks;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class MinimumRecolorsToGetConsecutiveBlackBlocksTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                // TODO
                arguments("BWBBWWBWWBWWWWWWBBBWWWBBBWWWWWWBWBW" +
                        "BBBBWBWWBWWBWBWWBWWWBWBBBWBWBWWWWWBWBBWB", 50, 27),
                arguments("W", 1, 1),
                arguments("WBBWWBBWBW", 7, 3),
                arguments("WBWBBBW", 2, 0)
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(String blocks, int k, int expected) {
        MinimumRecolorsToGetConsecutiveBlackBlocks loop =
                new MinimumRecolorsToGetConsecutiveBlackBlocksLoop();
        assertEquals(expected, loop.minimumRecolors(blocks, k));
    }
}
