package leetcode.p1400_1499.p1404_number_of_steps_to_reduce_number_in_binary_representation_to_one;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

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
