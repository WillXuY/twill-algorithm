package leetcode.p0000_0099.p0081_search_in_rotated_sorted_array_ii;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class SearchInRotatedSortedArrayIiTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[] {2, 5, 6, 0, 0, 1, 2}, 0, true),
                arguments(new int[] {2, 5, 6, 0, 0, 1, 2}, 3, false)
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(int[] nums, int target, boolean expected) {
        SearchInRotatedSortedArrayIi loop =
                new SearchInRotatedSortedArrayIiLoop();
        assertEquals(expected, loop.search(nums, target));
    }
}
