package leetcode.p2400_2499.p2432_the_employee_that_worked_on_the_longest_task;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class TheEmployeeThatWorkedOnTheLongestTaskTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(70, new int[][] {{36, 3}, {1, 5}, {12, 8}}, 12),
                arguments(10, new int[][] {{0, 3}, {2, 5}, {0, 9}, {1, 15}}, 1),
                arguments(26, new int[][] {{1,1}, {3, 7}, {2, 12}, {7, 17}}, 3),
                arguments(2, new int[][] {{0, 10}, {1, 20}}, 0)
        );
    }

    @ParameterizedTest(name = "Compare {index}")
    @MethodSource("dataProvider")
    public void testCompare(int n, int[][] logs, int expected) {
        TheEmployeeThatWorkedOnTheLongestTask compare =
                new TheEmployeeThatWorkedOnTheLongestTaskCompare();
        assertEquals(expected, compare.hardestWorker(n, logs));
    }
}
