package leetcode.p2100_2199.p2103_rings_and_rods;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class RingsAndRodsTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments("B0B6G0R6R0R6G9", 1),
                arguments("B0R0G0R9R0B0G0", 1),
                arguments("G4", 0)
        );
    }

    @ParameterizedTest(name = "Count {index}")
    @MethodSource("dataProvider")
    public void testCount(String rings, int expected) {
        RingsAndRods count = new RingsAndRodsCount();
        assertEquals(expected, count.countPoints(rings));
    }
}
