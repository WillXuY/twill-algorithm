package leetcode.p1400_1499.p1464_maximum_product_of_two_elements_in_an_array;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class MaximumProductOfTwoElementsInAnArrayTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[] {3, 4, 5, 2}, 12),
                arguments(new int[] {1, 5, 4, 5}, 16),
                arguments(new int[] {3, 7}, 12)
        );
    }

    @ParameterizedTest(name = "Max {index}")
    @MethodSource("dataProvider")
    public void testMax(int[] nums, int expected) {
        MaximumProductOfTwoElementsInAnArray max =
                new MaximumProductOfTwoElementsInAnArrayMax();
        assertEquals(expected, max.maxProduct(nums));
    }
}
