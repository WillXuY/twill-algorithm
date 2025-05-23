package leetcode.p1600_1699.p1608_special_array_withx_elements_greater_than_or_equalx;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class SpecialArrayWithxElementsGreaterThanOrEqualxTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[] {3, 6, 7, 7, 0}, -1),
                arguments(new int[] {3, 5}, 2),
                arguments(new int[] {0, 0}, -1),
                arguments(new int[] {0, 4, 3, 0, 4}, 3)
        );
    }

    @ParameterizedTest(name = "Sort {index}")
    @MethodSource("dataProvider")
    public void testSort(int[] nums, int expected) {
        SpecialArrayWithxElementsGreaterThanOrEqualX sort =
                new SpecialArrayWithxElementsGreaterThanOrEqualxSort();
        assertEquals(expected, sort.specialArray(nums));
    }
}
