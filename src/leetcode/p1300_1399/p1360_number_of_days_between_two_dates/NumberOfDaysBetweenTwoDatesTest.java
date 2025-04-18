package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.NumberOfDaysBetweenTwoDatesFormat;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class NumberOfDaysBetweenTwoDatesTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments("2019-06-29", "2019-06-30", 1),
                arguments("2020-01-15", "2019-12-31", 15)
        );
    }

    @ParameterizedTest(name = "Format {index}")
    @MethodSource("dataProvider")
    public void testFormat(String date1, String date2, int expected) {
        NumberOfDaysBetweenTwoDates format
                = new NumberOfDaysBetweenTwoDatesFormat();
        assertEquals(expected, format.daysBetweenDates(date1, date2));
    }
}
