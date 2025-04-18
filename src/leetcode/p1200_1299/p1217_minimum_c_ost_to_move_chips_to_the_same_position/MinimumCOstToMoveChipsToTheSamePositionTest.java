package leetcode.p1200_1299.p1217_minimum_c_ost_to_move_chips_to_the_same_position;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class MinimumCOstToMoveChipsToTheSamePositionTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[] {1, 2, 3}, 1),
                arguments(new int[] {2, 2, 2, 3, 3}, 2),
                arguments(new int[] {1, 1000000000}, 1)
        );
    }

    @ParameterizedTest(name = "Count {index}")
    @MethodSource("dataProvider")
    public void testCount(int[] position, int expected) {
        MinimumCostToMoveChipsToTheSamePosition count
                = new MinimumCostToMoveChipsToTheSamePositionCount();
        assertEquals(expected, count.minCostToMoveChips(position));
    }
}
