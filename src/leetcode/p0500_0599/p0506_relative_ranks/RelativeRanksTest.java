package org.willxu.algorithm.service.strs;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.strs.RelativeRanksPointer;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class RelativeRanksTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        new int[] {5, 4, 3, 2, 1},
                        new String[] {
                                "Gold Medal", "Silver Medal", "Bronze Medal",
                                "4", "5"
                        }
                ),
                arguments(
                        new int[] {10, 3, 8, 9, 4},
                        new String[] {
                                "Gold Medal", "5", "Bronze Medal",
                                "Silver Medal", "4"
                        }
                )
        );
    }

    @ParameterizedTest(name = "Pointer {index}")
    @MethodSource("dataProvider")
    public void testPointer(int[] input, String[] expected) {
        RelativeRanks pointer = new RelativeRanksPointer();
        assertArrayEquals(expected, pointer.findRelativeRanks(input));
    }
}
