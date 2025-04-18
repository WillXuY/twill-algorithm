package leetcode.p1100_1199.p1154_day_of_the_year;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

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
    public void testFormat(String date, int expected) {
        DayOfTheYear format = new DayOfTheYearFormat();
        assertEquals(expected, format.dayOfYear(date));
    }
}
