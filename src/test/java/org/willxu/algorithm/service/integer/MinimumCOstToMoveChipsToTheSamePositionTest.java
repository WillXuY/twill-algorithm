package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.MinimumCostToMoveChipsToTheSamePositionCount;

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
    public void testCount(int[] position, int excepted) {
        MinimumCostToMoveChipsToTheSamePosition count
                = new MinimumCostToMoveChipsToTheSamePositionCount();
        assertEquals(excepted, count.minCostToMoveChips(position));
    }
}
