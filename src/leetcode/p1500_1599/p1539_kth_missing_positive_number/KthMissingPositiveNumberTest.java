package leetcode.p1500_1599.p1539_kth_missing_positive_number;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class KthMissingPositiveNumberTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[] {1, 2}, 1, 3),
                arguments(new int[] {2, 3, 4, 7, 11}, 5, 9),
                arguments(new int[] {1, 2, 3, 4}, 2, 6)
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(int[] arr, int k, int expected) {
        KthMissingPositiveNumber loop = new KthMissingPositiveNumberLoop();
        assertEquals(expected, loop.findKthPositive(arr, k));
    }
}
