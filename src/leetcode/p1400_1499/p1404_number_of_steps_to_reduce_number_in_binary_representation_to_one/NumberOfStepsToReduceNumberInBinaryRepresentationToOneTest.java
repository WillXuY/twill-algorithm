package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.NumberOfStepsToReduceNumberInBinaryRepresentationToOneLoop;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class NumberOfStepsToReduceNumberInBinaryRepresentationToOneTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments("1101", 6),
                arguments("10", 1),
                arguments("1", 0)
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(String s, int expected) {
        NumberOfStepsToReduceNumberInBinaryRepresentationToOne loop =
                new NumberOfStepsToReduceNumberInBinaryRepresentationToOneLoop();
        assertEquals(expected, loop.numSteps(s));
    }
}
