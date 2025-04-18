package leetcode.p2400_2499.p2485_find_the_pivot_integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class FindThePivotIntegerTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(8, 6),
                arguments(1, 1),
                arguments(4, -1)
        );
    }

    @ParameterizedTest(name = "Count {index}")
    @MethodSource("dataProvider")
    public void testCount(int n, int expected) {
        FindThePivotInteger count = new FindThePivotIntegerCount();
        assertEquals(expected, count.pivotInteger(n));
    }
}
