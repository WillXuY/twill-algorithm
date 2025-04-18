package leetcode.p0400_0499.p0453_minimum_moves_to_equal_array_elements;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class MinimumMovesToEqualArrayElementsTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                // Wrong answer 1:
                arguments(
                        new int[] {83,86,77,15,93,35,86,92,49,21},
                        487
                ),
                /*
                3 step.
                1,2,3 -> 2,3,3 -> 3,4,3 -> 4,4,4
                increment n-1 = 2 elements of the array by 1.
                 */
                arguments(new int[] {1, 2, 3}, 3),
                arguments(new int[] {1, 1, 1}, 0)
        );
    }

    @ParameterizedTest(name = "Math {index}")
    @MethodSource("dataProvider")
    public void testMath(int[] input, int expected) {
        MinimumMovesToEqualArrayElements math =
                new MinimumMovesToEqualArrayElementsMath();
        assertEquals(expected, math.minMoves(input));
    }
}
