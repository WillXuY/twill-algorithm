package leetcode.p0500_0599.p0518_coin_change_ii;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CoinChangeIiTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                // Time Limit Exceeded: Recursive.
                Arguments.arguments(
                        500,
                        new int[] {3, 5, 7, 8, 9, 10, 11},
                        35502874
                ),
                Arguments.arguments(0, new int[] {7}, 1),
                Arguments.arguments(5, new int[] {1, 2, 5}, 4),
                Arguments.arguments(3, new int[] {2}, 0),
                Arguments.arguments(10, new int[] {10}, 1)
        );
    }

    @ParameterizedTest(name = "Recursive {index}")
    @MethodSource("dataProvider")
    public void testRecursive(int amount, int[] coins, int expected) {
        CoinChangeIi recursive = new CoinChangeIiRecursive();
        assertEquals(expected, recursive.change(amount, coins));
    }
}
