package leetcode.p0100_0199.p0162_find_peak_element;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindPeakElementTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.arguments(new int[] {1, 2}, 1),
                Arguments.arguments(new int[] {1}, 0),
                Arguments.arguments(new int[] {1, 2, 3, 1}, 2),
                Arguments.arguments(new int[] {1, 2, 1, 3, 5, 6, 4}, 1)
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(int[] nums, int expected) {
        FindPeakElement loop = new FindPeakElementLoop();
        assertEquals(expected, loop.findPeakElement(nums));
    }
}
