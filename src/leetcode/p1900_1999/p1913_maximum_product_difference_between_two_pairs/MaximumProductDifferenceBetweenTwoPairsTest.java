package leetcode.p1900_1999.p1913_maximum_product_difference_between_two_pairs;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class MaximumProductDifferenceBetweenTwoPairsTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[] {5, 6, 2, 7, 4}, 34),
                arguments(new int[] {4, 2, 5, 9, 7, 4, 8}, 64)
        );
    }

    @ParameterizedTest(name = "Extremum {index}")
    @MethodSource("dataProvider")
    public void testExtremum(int[] nums, int expected) {
        MaximumProductDifferenceBetweenTwoPairs extremum =
                new MaximumProductDifferenceBetweenTwoPairsExtremum();
        assertEquals(expected, extremum.maxProductDifference(nums));
    }
}
