package leetcode.p0200_0299.p0264_ugly_number_ii;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UglyNumberIiTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.arguments(10, 12),
                Arguments.arguments(1, 1)
        );
    }

    @ParameterizedTest(name = "Min {index}")
    @MethodSource("dataProvider")
    public void testMin(int n, int expected) {
        UglyNumberIi min = new UglyNumberIiMin();
        assertEquals(expected, min.nthUglyNumber(n));
    }
}
