package leetcode.p2400_2499.p2465_number_of_distinct_averages;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class NumberOfDistinctAveragesTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[] {4, 1, 4, 0, 3, 5}, 2),
                arguments(new int[] {1, 100}, 1)
        );
    }

    @ParameterizedTest(name = "Sort {index}")
    @MethodSource("dataProvider")
    public void testSort(int[] nums, int expected) {
        NumberOfDistinctAverages sort = new NumberOfDistinctAveragesSort();
        assertEquals(expected, sort.distinctAverages(nums));
    }
}
