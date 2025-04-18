package leetcode.p1900_1999.p1952_three_divisors;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class ThreeDivisorsTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(14, false),
                arguments(2, false),
                arguments(4, true)
        );
    }

    @ParameterizedTest(name = "Exhaustive {index}")
    @MethodSource("dataProvider")
    public void testExhaustive(int n, boolean expected) {
        ThreeDivisors exhaustive = new ThreeDivisorsExhaustive();
        assertEquals(expected, exhaustive.isThree(n));
    }
}
