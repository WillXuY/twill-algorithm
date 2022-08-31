package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.FinalValueOfVariableAfterPerformingOperationsMap;

import java.util.stream.Stream;

import static org.gradle.internal.impldep.org.junit.Assert.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class FinalValueOfVariableAfterPerformingOperationsTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new String[] {"--X", "X++", "X++"}, 1),
                arguments(new String[] {"++X", "++X", "X++"}, 3),
                arguments(new String[] {"X++", "++X", "--X", "X--"}, 0)
        );
    }

    @ParameterizedTest(name = "Map {index}")
    @MethodSource("dataProvider")
    public void testMap(String[] operations, int excepted) {
        FinalValueOfVariableAfterPerformingOperations map =
                new FinalValueOfVariableAfterPerformingOperationsMap();
        assertEquals(excepted, map.finalValueAfterOperations(operations));
    }
}
