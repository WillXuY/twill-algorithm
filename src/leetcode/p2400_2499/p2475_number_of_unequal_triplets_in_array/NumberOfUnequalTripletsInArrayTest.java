package leetcode.p2400_2499.p2475_number_of_unequal_triplets_in_array;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class NumberOfUnequalTripletsInArrayTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[] {1, 3, 1, 2, 4}, 7),
                arguments(new int[] {4, 4, 2, 4, 3}, 3),
                arguments(new int[] {1, 1, 1, 1, 1}, 0)
        );
    }

    @ParameterizedTest(name = "Count {index}")
    @MethodSource("dataProvider")
    public void testCount(int[] nums, int expected) {
        NumberOfUnequalTripletsInArray count =
                new NumberOfUnequalTripletsInArrayCount();
        assertEquals(expected, count.unequalTriplets(nums));
    }
}
