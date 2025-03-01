package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.ReachNumberSet;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReachNumberTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                // Time Limit Exceeded.
                Arguments.arguments(-1000000000, 44723),
                Arguments.arguments(2, 3),
                Arguments.arguments(3, 2)
        );
    }

    @ParameterizedTest(name = "Set {index}")
    @MethodSource("dataProvider")
    public void testSet(int target, int expected) {
        ReachNumber set = new ReachNumberSet();
        assertEquals(expected, set.reachNumber(target));
    }
}
