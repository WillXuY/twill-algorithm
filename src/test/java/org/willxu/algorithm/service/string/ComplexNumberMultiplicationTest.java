package org.willxu.algorithm.service.string;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.string.ComplexNumberMultiplicationSplit;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ComplexNumberMultiplicationTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.arguments("1+1i", "1+1i", "0+2i"),
                Arguments.arguments("1+-1i", "1+-1i", "0+-2i")
        );
    }

    @ParameterizedTest(name = "Split {index}")
    @MethodSource("dataProvider")
    public void testSplit(String num1, String num2, String expected) {
        ComplexNumberMultiplication split =
                new ComplexNumberMultiplicationSplit();
        assertEquals(expected, split.complexNumberMultiply(num1, num2));
    }
}
