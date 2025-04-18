package leetcode.p0400_0499.p0414_third_maximum_number;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ThirdMaximumNumberTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                // Wrong answer 1
                Arguments.arguments(new int[] {2, 2, 2, 1}, 2),
                Arguments.arguments(new int[] {3, 2, 1}, 1),
                Arguments.arguments(new int[] {1, 2}, 2),
                Arguments.arguments(new int[] {2, 2, 3, 1}, 1)
        );
    }

    @ParameterizedTest(name = "Compare {index}")
    @MethodSource("dataProvider")
    public void testCompare(int[] input, int expected) {
        ThirdMaximumNumber compare = new ThirdMaximumNumberCompare();
        assertEquals(expected, compare.thirdMax(input));
    }
}
