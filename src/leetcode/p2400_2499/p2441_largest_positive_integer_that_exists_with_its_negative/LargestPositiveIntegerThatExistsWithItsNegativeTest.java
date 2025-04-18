package leetcode.p2400_2499.p2441_largest_positive_integer_that_exists_with_its_negative;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class LargestPositiveIntegerThatExistsWithItsNegativeTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[] {-1, 2, -3, 3}, 3),
                arguments(new int[] {-1, 10, 6, 7, -7, 1}, 7),
                arguments(new int[] {-10, 8, 6, 7, -2, -3}, -1)
        );
    }

    @ParameterizedTest(name = "Set {index}")
    @MethodSource("dataProvider")
    public void testSet(int[] nums, int expected) {
        LargestPositiveIntegerThatExistsWithItsNegative set =
                new LargestPositiveIntegerThatExistsWithItsNegativeSet();
        assertEquals(expected, set.findMaxK(nums));
    }
}
