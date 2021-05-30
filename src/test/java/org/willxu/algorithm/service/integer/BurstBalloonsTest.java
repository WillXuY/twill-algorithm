package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.BurstBalloonsWrongImpl;
import org.willxu.algorithm.service.integer.BurstBalloonsService;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class BurstBalloonsTest {
    /**
     * Example:
     * Input: [3, 1, 5, 8]
     * Output: 167
     * Explanation: nums = [3, 1, 5, 8] --> [3, 5, 8] --> [3, 8] --> [8] --> []
     *             coins =   3*1*5      +     3*5*8   +  1*3*8   +  1*8*1 = 167
     */
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[] {3, 1, 5, 8}, 167),
                arguments(new int[] {1, 5}, 10)
        );
    }

    @ParameterizedTest(name = "Brute force {index}")
    @MethodSource("dataProvider")
    public void testGetBurstBalloons(int[] input, int output) {
        BurstBalloonsService wrong = new BurstBalloonsWrongImpl();
        assertEquals(output, wrong.getBurstBalloons(input));
    }
}
