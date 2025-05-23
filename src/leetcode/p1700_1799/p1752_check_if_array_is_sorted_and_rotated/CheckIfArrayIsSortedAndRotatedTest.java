package leetcode.p1700_1799.p1752_check_if_array_is_sorted_and_rotated;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CheckIfArrayIsSortedAndRotatedTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[] {3, 4, 5, 1, 2}, true),
                arguments(new int[] {2, 1, 3, 4}, false),
                arguments(new int[] {1, 2, 3}, true)
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(int[] nums, boolean expected) {
        CheckIfArrayIsSortedAndRotated loop =
                new CheckIfArrayIsSortedAndRotatedLoop();
        assertEquals(expected, loop.check(nums));
    }
}
