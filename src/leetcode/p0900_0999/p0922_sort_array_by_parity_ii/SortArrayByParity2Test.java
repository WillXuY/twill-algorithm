package leetcode.p0900_0999.p0922_sort_array_by_parity_ii;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class SortArrayByParity2Test {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[] {4, 2, 5, 7}, new int[] {4, 5, 2, 7}),
                arguments(new int[] {2, 3}, new int[] {2, 3})
        );
    }

    @ParameterizedTest(name = "index {index}")
    @MethodSource("dataProvider")
    public void testIndex(int[] nums, int[] expected) {
        SortArrayByParity2 index = new SortArrayByParity2Index();
        assertArrayEquals(expected, index.sortArrayByParityII(nums));
    }
}
