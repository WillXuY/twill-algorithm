package leetcode.p1700_1799.p1700_number_of_students_unable_to_eat_lunch;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class NumberOfStudentsUnableToEatLunchTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[] {1, 1, 0, 0}, new int[] {0, 1, 0, 1}, 0),
                /*
                1 1 0 0 1
                0 0 0 1 1

                0 0 1 1 1
                0 0 0 1 1

                1 1 1
                0 1 1
                 */
                arguments(
                        new int[] {1, 1, 1, 0, 0, 1},
                        new int[] {1, 0, 0, 0, 1, 1},
                        3
                )
        );
    }

    @ParameterizedTest(name = "Count {index}")
    @MethodSource("dataProvider")
    public void testCount(int[] students, int[] sandwiches, int expected) {
        NumberOfStudentsUnableToEatLunch count
                = new NumberOfStudentsUnableToEatLunchCount();
        assertEquals(expected, count.countStudents(students, sandwiches));
    }
}
