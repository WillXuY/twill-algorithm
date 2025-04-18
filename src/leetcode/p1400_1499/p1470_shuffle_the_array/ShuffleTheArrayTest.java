package leetcode.p1400_1499.p1470_shuffle_the_array;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class ShuffleTheArrayTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        new int[] {2, 5, 1, 3, 4, 7},
                        3,
                        new int[] {2, 3, 5, 4, 1, 7}
                ),
                arguments(
                        new int[] {1, 2, 3, 4, 4, 3, 2, 1},
                        4,
                        new int[] {1, 4, 2, 3, 3, 2, 4, 1}
                ),
                arguments(new int[] {1, 1, 2, 2}, 2, new int[] {1, 2, 1, 2})
        );
    }

    @ParameterizedTest(name = "Exchange {index}")
    @MethodSource("dataProvider")
    public void testExchange(int[] nums, int n, int[] expected) {
        ShuffleTheArray exchange = new ShuffleTheArrayExchange();
        assertArrayEquals(expected, exchange.shuffle(nums, n));
    }
}
