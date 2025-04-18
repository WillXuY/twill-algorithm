package leetcode.p1200_1299.p1287_element_appearing_more_than25p_in_sorted_array;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class ElementAppearingMoreThan25pInSortedArrayTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[] {1, 2, 2, 6, 6, 6, 6, 7, 10}, 6),
                arguments(new int[] {1, 1}, 1)
        );
    }

    @ParameterizedTest(name = "Count {index}")
    @MethodSource("dataProvider")
    public void testCount(int[] arr, int expected) {
        ElementAppearingMoreThan25pInSortedArray count
                = new ElementAppearingMoreThan25pInSortedArrayCount();
        assertEquals(expected, count.findSpecialInteger(arr));
    }
}
