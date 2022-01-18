package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.NrepeatedElementInSize2nArraySet;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class NrepeatedElementInSize2nArrayTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[] {1, 2, 3, 3}, 3),
                arguments(new int[] {2, 1, 2, 5, 3, 2}, 2),
                arguments(new int[] {5, 1, 5, 2, 5, 3, 5, 4}, 5)
        );
    }

    @ParameterizedTest(name = "Set {index}")
    @MethodSource("dataProvider")
    public void testSet(int[] nums, int excepted) {
        NrepeatedElementInSize2nArray set =
                new NrepeatedElementInSize2nArraySet();
        assertEquals(excepted, set.repeatedNTimes(nums));
    }
}
