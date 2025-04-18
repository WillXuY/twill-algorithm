package leetcode.p2100_2199.p2148_count_elements_with_strictly_smaller_and_greater_elements;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CountElementsWithStrictlySmallerAndGreaterElementsTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[] {11, 7, 2, 15}, 2),
                arguments(new int[] {-3, 3, 3, 90}, 2)
        );
    }

    @ParameterizedTest(name = "Sort {index}")
    @MethodSource("dataProvider")
    public void testSort(int[] nums, int expected) {
        CountElementsWithStrictlySmallerAndGreaterElements sort =
                new CountElementsWithStrictlySmallerAndGreaterElementsSort();
        assertEquals(expected, sort.countElements(nums));
    }
}
