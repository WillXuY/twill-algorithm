package leetcode.p0600_0699.p0670_maximum_swap;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumSwapTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.arguments(2736, 7236),
                Arguments.arguments(9973, 9973)
        );
    }

    @ParameterizedTest(name = "Map {index}")
    @MethodSource("dataProvider")
    public void testMap(int num, int expected) {
        MaximumSwap map = new MaximumSwapMap();
        assertEquals(expected, map.maximumSwap(num));
    }
}
