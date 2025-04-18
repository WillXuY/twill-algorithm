package leetcode.p1000_1099.p1046_last_stone_weight;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class LastStoneWeightTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                // 2. Remove the two number one by one.
                arguments(new int[] {10, 4, 2, 10}, 2),
                // 1. Save the difference before exchange two number.
                arguments(new int[] {3, 1}, 2),
                /*
                8 - 7: 2, 4, 1, 1, 1
                4 - 2: 2, 1, 1, 1
                2 - 1: 1, 1, 1
                1 - 1: 1
                 */
                arguments(new int[] {2, 7, 4, 1, 8, 1}, 1),
                arguments(new int[] {1}, 1)
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(int[] stones, int expected) {
        LastStoneWeight loop = new LastStoneWeightLoop();
        assertEquals(expected, loop.lastStoneWeight(stones));
    }
}
