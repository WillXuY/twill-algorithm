package leetcode.p1000_1099.p1089_duplicate_zeros;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class DuplicateZerosTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        new int[] {1, 0, 2, 3, 0, 4, 5, 0},
                        new int[] {1, 0, 0, 2, 3, 0, 0, 4}
                ),
                arguments(
                        new int[] {1, 2, 3},
                        new int[] {1, 2, 3}
                )
        );
    }

    @ParameterizedTest(name = "expected {index}")
    @MethodSource("dataProvider")
    public void testCopy(int[] arr, int[] expected) {
        DuplicateZeros copy = new DuplicateZerosCopy();
        copy.duplicateZeros(arr);
        assertArrayEquals(expected, arr);
    }
}
