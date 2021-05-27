package org.willxu.algorithm.service.int2int;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.int2int.NthTribonacciNumberRecursiveImpl;
import org.willxu.algorithm.service.impl.int2int.NthTribonacciNumberServiceImpl;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class NthTribonacciNumberTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(4, 4),
                arguments(25, 1389537)
        );
    }

    @ParameterizedTest(name = "Brute force {index}")
    @MethodSource("dataProvider")
    public void testGetNthTribonacciNumberBruteForce(int input, int output) {
        NthTribonacciNumberService bruteForce = new NthTribonacciNumberServiceImpl();
        assertEquals(output, bruteForce.getNthTribonacciNumber(input));
    }

    @ParameterizedTest(name = "recursive {index}")
    @MethodSource("dataProvider")
    public void testGetNthTribonacciNumberRecursive(int input, int output) {
        NthTribonacciNumberService recursive = new NthTribonacciNumberRecursiveImpl();
        assertEquals(output, recursive.getNthTribonacciNumber(input));
    }

}
