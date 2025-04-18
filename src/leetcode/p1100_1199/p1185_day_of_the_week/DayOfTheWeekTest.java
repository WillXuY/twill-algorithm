package org.willxu.algorithm.service.string;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.string.DayOfTheWeekCalendar;

import java.util.Calendar;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class DayOfTheWeekTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(31, 8, 2019, "Saturday"),
                arguments(18, 7, 1999, "Sunday"),
                arguments(15, 8, 1993, "Sunday")
        );
    }

    @ParameterizedTest(name = "Calendar {index}")
    @MethodSource("dataProvider")
    public void testCalendar(int day, int month, int year, String expected) {
        DayOfTheWeek calendar = new DayOfTheWeekCalendar();
        assertEquals(expected, calendar.dayOfTheWeek(day, month, year));
    }

    @Test
    public void testCalendarGetDayOfWeek() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(2019, Calendar.AUGUST, 31);
        int dayOfWeekIndex = calendar.get(Calendar.DAY_OF_WEEK) - 1;
        System.out.println(dayOfWeekIndex);
    }
}
