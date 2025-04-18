package leetcode.p0100_0199.p0137_single_number_ii;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SingleNumberIiTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.arguments(new int[] {2, 2, 3, 2}, 3),
                Arguments.arguments(new int[] {0, 1, 0, 1, 0, 1, 99}, 99)
        );
    }

    @ParameterizedTest(name = "Set {index}")
    @MethodSource("dataProvider")
    public void testSet(int[] nums, int expected) {
        SingleNumberIi set = new SingleNumberIiSet();
        assertEquals(expected, set.singleNumber(nums));
    }
}
