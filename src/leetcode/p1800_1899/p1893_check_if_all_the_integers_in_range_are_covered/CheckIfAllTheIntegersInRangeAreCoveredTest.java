package leetcode.p1800_1899.p1893_check_if_all_the_integers_in_range_are_covered;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CheckIfAllTheIntegersInRangeAreCoveredTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[][] {{1, 2}, {3, 4}, {5, 6}}, 2, 5, true),
                arguments(new int[][] {{1, 10}, {10, 20}}, 21, 21, false)
        );
    }

    @ParameterizedTest(name = "Set {index}")
    @MethodSource("dataProvider")
    public void testSet(int[][] ranges, int left, int right, boolean expected) {
        CheckIfAllTheIntegersInRangeAreCovered set =
                new CheckIfAllTheIntegersInRangeAreCoveredSet();
        assertEquals(expected, set.isCovered(ranges, left, right));
    }
}
