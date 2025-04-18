package leetcode.p0900_0999.p0905_sort_array_by_parity;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class SortArrayByParityTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[] {3, 1, 2, 4}, new int[] {2, 4, 3, 1}),
                arguments(new int[] {0}, new int[] {0})
        );
    }

    @ParameterizedTest(name = "dataProvider")
    @MethodSource("dataProvider")
    public void testLoop(int[] nums, int[] expected) {
        SortArrayByParity loop = new SortArrayByParityLoop();
        assertArrayEquals(expected, loop.sortArrayByParity(nums));
    }
}
