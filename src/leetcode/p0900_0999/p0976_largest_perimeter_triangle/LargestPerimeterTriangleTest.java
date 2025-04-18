package leetcode.p0900_0999.p0976_largest_perimeter_triangle;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class LargestPerimeterTriangleTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                // 1. Loop the same number in nums.
                arguments(new int[] {1, 2, 2, 4, 18, 8}, 5),
                arguments(new int[] {2, 1, 2}, 5),
                arguments(new int[] {1, 2, 1}, 0)
        );
    }

    @ParameterizedTest(name = "Map {index}")
    @MethodSource("dataProvider")
    public void testMap(int[] nums, int expected) {
        LargestPerimeterTriangle map = new LargestPerimeterTriangleMap();
        assertEquals(expected, map.largestPerimeter(nums));
    }
}
