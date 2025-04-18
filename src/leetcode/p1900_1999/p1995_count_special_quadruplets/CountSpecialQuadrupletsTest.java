package leetcode.p1900_1999.p1995_count_special_quadruplets;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CountSpecialQuadrupletsTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[] {1, 2, 3, 6}, 1),
                arguments(new int[] {3, 3, 6, 4, 5}, 0),
                arguments(new int[] {1, 1, 1, 3, 5}, 4)
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(int[] nums, int expected) {
        CountSpecialQuadruplets loop = new CountSpecialQuadrupletsLoop();
        assertEquals(expected, loop.countQuadruplets(nums));
    }
}
