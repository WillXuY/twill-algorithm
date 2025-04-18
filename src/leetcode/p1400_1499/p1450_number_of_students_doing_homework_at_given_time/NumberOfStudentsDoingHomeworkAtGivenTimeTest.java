package leetcode.p1400_1499.p1450_number_of_students_doing_homework_at_given_time;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class NumberOfStudentsDoingHomeworkAtGivenTimeTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        new int[] {1, 2, 3},
                        new int[] {3, 2, 7},
                        4, 1
                ),
                arguments(
                        new int[] {4},
                        new int[] {4},
                        4, 1
                )
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(
            int[] startTime, int[] endTime, int queryTime, int expected) {
        NumberOfStudentsDoingHomeworkAtGivenTime loop =
                new NumberOfStudentsDoingHomeworkAtGivenTimeLoop();
        assertEquals(expected, loop.busyStudent(startTime, endTime, queryTime));
    }
}
