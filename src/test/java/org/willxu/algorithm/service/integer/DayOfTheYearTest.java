package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.DayOfTheYearFormat;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class DayOfTheYearTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments("2019-01-09", 9),
                arguments("2019-02-10", 41)
        );
    }

    @ParameterizedTest(name = "Format {index}")
    @MethodSource("dataProvider")
    public void testFormat(String date, int excepted) {
        DayOfTheYear format = new DayOfTheYearFormat();
        assertEquals(excepted, format.dayOfYear(date));
    }
}
