package leetcode.p0000_0099.p0016_three_sum_closest;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class ThreeSumClosestTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[] {4, 0, 5, -5, 3, 3, 0, -4, -5}, -2, -2),
                arguments(new int[] {-1, 2, 1, -4}, 1, 2),
                arguments(new int[] {0, 0, 0}, 1, 0)
        );
    }

    @ParameterizedTest(name = "Pointer {index}")
    @MethodSource("dataProvider")
    public void testPointer(int[] nums, int target, int expected) {
        ThreeSumClosest pointer = new ThreeSumClosestPointer();
        assertEquals(expected, pointer.threeSumClosest(nums, target));
    }
}
