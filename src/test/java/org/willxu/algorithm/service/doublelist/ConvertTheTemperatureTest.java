package org.willxu.algorithm.service.doublelist;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.doublelist.ConvertTheTemperatureCalculate;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class ConvertTheTemperatureTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(36.5, new double[] {309.65, 97.7}),
                arguments(122.11, new double[] {395.26, 251.798})
        );
    }

    @ParameterizedTest(name = "Calculate {index}")
    @MethodSource("dataProvider")
    public void testCalculate(double celsius, double[] expected) {
        ConvertTheTemperature calculate = new ConvertTheTemperatureCalculate();
        assertArrayEquals(expected, calculate.convertTemperature(celsius));
    }
}
