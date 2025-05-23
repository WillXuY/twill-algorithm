package leetcode.p0400_0499.p0485_max_consecutive_ones;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class MaxConsecutiveOnesTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[] {1, 1, 0, 1, 1, 1}, 3),
                arguments(new int[] {1, 0, 1, 1, 0, 1}, 2)
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(int[] input, int expected) {
        MaxConsecutiveOnes loop = new MaxConsecutiveOnesLoop();
        assertEquals(expected, loop.findMaxConsecutiveOnes(input));
    }
}
