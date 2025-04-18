package leetcode.p2400_2499.p2413_smallest_even_multiple;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class SmallestEvenMultipleTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(5, 10),
                arguments(6, 6)
        );
    }

    @ParameterizedTest(name = "And {index}")
    @MethodSource("dataProvider")
    public void testAnd(int n, int expected) {
        SmallestEvenMultiple and = new SmallestEvenMultipleAnd();
        assertEquals(expected, and.smallestEvenMultiple(n));
    }
}
