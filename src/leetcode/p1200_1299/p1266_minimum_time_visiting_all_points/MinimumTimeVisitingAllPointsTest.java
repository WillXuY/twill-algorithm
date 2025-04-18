package leetcode.p1200_1299.p1266_minimum_time_visiting_all_points;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class MinimumTimeVisitingAllPointsTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[][] {{1, 1}, {3, 4}, {-1, 0}}, 7),
                arguments(new int[][] {{3, 2}, {-2, 2}}, 5)
        );
    }

    @ParameterizedTest(name = "Abs {index}")
    @MethodSource("dataProvider")
    public void testAbs(int[][] points, int expected) {
        MinimumTimeVisitingAllPoints abs =
                new MinimumTimeVisitingAllPointsAbs();
        assertEquals(expected, abs.minTimeToVisitAllPoints(points));
    }
}
