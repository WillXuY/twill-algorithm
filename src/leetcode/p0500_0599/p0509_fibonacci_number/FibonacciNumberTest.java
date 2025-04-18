package leetcode.p0500_0599.p0509_fibonacci_number;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class FibonacciNumberTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(2, 1),
                arguments(3, 2),
                arguments(4, 3)
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(int input, int expected) {
        FibonacciNumber loop = new FibonacciNumberLoop();
        assertEquals(expected, loop.fib(input));
    }
}
