package leetcode.p1700_1799.p1748_sum_of_unique_elements;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class SumOfUniqueElementsTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[] {1, 2, 3, 2}, 4),
                arguments(new int[] {1, 1, 1, 1, 1}, 0),
                arguments(new int[] {1, 2, 3, 4, 5}, 15)
        );
    }

    @ParameterizedTest(name = "Count {index}")
    @MethodSource("dataProvider")
    public void testCount(int[] nums, int expected) {
        SumOfUniqueElements count = new SumOfUniqueElementsCount();
        assertEquals(expected, count.sumOfUnique(nums));
    }
}
