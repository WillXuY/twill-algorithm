package leetcode.p2000_2099.p2011_final_value_of_variable_after_performing_operations;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
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
    public void testMap(String[] operations, int expected) {
        FinalValueOfVariableAfterPerformingOperations map =
                new FinalValueOfVariableAfterPerformingOperationsMap();
        assertEquals(expected, map.finalValueAfterOperations(operations));
    }
}
