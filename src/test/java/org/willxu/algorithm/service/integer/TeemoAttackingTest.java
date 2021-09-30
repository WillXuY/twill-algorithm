package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.TeemoAttackingLoop;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class TeemoAttackingTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                /*
                second isPoisoned
                1      1
                2      1
                3      0
                4      1
                5      1
                total 4
                 */
                arguments(new int[] {1, 4}, 2, 4),
                // at second reset poison timer.
                arguments(new int[] {1, 2}, 2, 3)
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(int[] timeSeries, int duration, int excepted) {
        TeemoAttacking loop = new TeemoAttackingLoop();
        assertEquals(excepted, loop.findPoisonedDuration(timeSeries, duration));
    }
}
