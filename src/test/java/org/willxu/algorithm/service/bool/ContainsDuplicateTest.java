package org.willxu.algorithm.service.bool;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.bool.ContainsDuplicateBubble;
import org.willxu.algorithm.service.impl.bool.ContainsDuplicateSet;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class ContainsDuplicateTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                /* Wrong answer1 of set. */
                arguments(new int[] {3, 3}, true),
                arguments(new int[] {1, 2, 3, 1}, true),
                arguments(new int[] {1, 2, 3, 4}, false),
                arguments(new int[] {1, 1, 1, 3, 3, 4, 3, 2, 4, 2}, true)
        );
    }

    /**
     * Use Hash set
     */
    @ParameterizedTest(name = "Set {index}")
    @MethodSource("dataProvider")
    public void testSet(int[] input, boolean excepted) {
        ContainsDuplicate set = new ContainsDuplicateSet();
        assertEquals(excepted, set.containsDuplicate(input));
    }

    /**
     * Time limit exceeded.
     */
    @ParameterizedTest(name = "Bubble {index}")
    @MethodSource("dataProvider")
    public void testBubble(int[] input, boolean excepted) {
        ContainsDuplicate bubble = new ContainsDuplicateBubble();
        assertEquals(excepted, bubble.containsDuplicate(input));
    }
}
