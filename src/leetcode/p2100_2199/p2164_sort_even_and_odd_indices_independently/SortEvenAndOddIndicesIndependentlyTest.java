package leetcode.p2100_2199.p2164_sort_even_and_odd_indices_independently;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class SortEvenAndOddIndicesIndependentlyTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        new int[] {36,45,32,31,15,41,9,46,36,6,15,16,33,26,27,31,44,34},
                        new int[] {9,46,15,45,15,41,27,34,32,31,33,31,36,26,36,16,44,6}
                ),
                arguments(new int[] {4, 1, 2, 3}, new int[] {2, 3, 4, 1}),
                arguments(new int[] {2, 1}, new int[] {2, 1})
        );
    }

    @ParameterizedTest(name = "Insert {index}")
    @MethodSource("dataProvider")
    public void testInsert(int[] nums, int[] expected) {
        SortEvenAndOddIndicesIndependently insert =
                new SortEvenAndOddIndicesIndependentlyInsert();
        assertArrayEquals(expected, insert.sortEvenOdd(nums));
    }
}
