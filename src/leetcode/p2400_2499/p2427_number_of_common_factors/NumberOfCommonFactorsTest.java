package leetcode.p2400_2499.p2427_number_of_common_factors;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class NumberOfCommonFactorsTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(12, 6, 4),
                arguments(25, 30, 2)
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(int a, int b, int expected) {
        NumberOfCommonFactors loop = new NumberOfCommonFactorsLoop();
        assertEquals(expected, loop.commonFactors(a, b));
    }
}
