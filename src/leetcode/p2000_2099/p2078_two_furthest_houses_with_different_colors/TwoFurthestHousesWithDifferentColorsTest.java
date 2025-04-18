package leetcode.p2000_2099.p2078_two_furthest_houses_with_different_colors;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class TwoFurthestHousesWithDifferentColorsTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[] {1, 1, 1, 6, 1, 1, 1}, 3),
                arguments(new int[] {1, 8, 3, 8, 3}, 4),
                arguments(new int[] {0, 1}, 1)
        );
    }

    @ParameterizedTest(name = "Extremum {index}")
    @MethodSource("dataProvider")
    public void testExtremum(int[] colors, int expected) {
        TwoFurthestHousesWithDifferentColors extremum =
                new TwoFurthestHousesWithDifferentColorsExtremum();
        assertEquals(expected, extremum.maxDistance(colors));
    }
}
