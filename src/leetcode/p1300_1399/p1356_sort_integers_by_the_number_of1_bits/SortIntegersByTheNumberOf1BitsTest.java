package leetcode.p1300_1399.p1356_sort_integers_by_the_number_of1_bits;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class SortIntegersByTheNumberOf1BitsTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                // 1. Copy array length + 1.
                arguments(
                        new int[] {10, 100, 1000, 10000},
                        new int[] {10, 100, 10000, 1000}
                ),
                arguments(
                        new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8},
                        new int[] {0, 1, 2, 4, 8, 3, 5, 6, 7}
                ),
                arguments(
                        new int[] {1024, 512, 256, 128, 64, 32, 16, 8, 4, 2, 1},
                        new int[] {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024}
                )
        );
    }

    @ParameterizedTest(name = "Count {index}")
    @MethodSource("dataProvider")
    public void testCount(int[] arr, int[] expected) {
        SortIntegersByTheNumberOf1Bits count
                = new SortIntegersByTheNumberOf1BitsCount();
        assertArrayEquals(expected, count.sortByBits(arr));
    }
}
