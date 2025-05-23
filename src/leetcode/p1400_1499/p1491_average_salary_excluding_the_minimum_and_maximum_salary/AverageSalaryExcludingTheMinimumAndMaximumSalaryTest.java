package leetcode.p1400_1499.p1491_average_salary_excluding_the_minimum_and_maximum_salary;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class AverageSalaryExcludingTheMinimumAndMaximumSalaryTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[] {4000, 3000, 1000, 2000}, 2500.0),
                arguments(new int[] {1000, 2000, 3000}, 2000.0)
        );
    }

    @ParameterizedTest(name = "Sort {index}")
    @MethodSource("dataProvider")
    public void testSort(int[] salary, double expected) {
        AverageSalaryExcludingTheMinimumAndMaximumSalary sort =
                new AverageSalaryExcludingTheMinimumAndMaximumSalarySort();
        assertEquals(expected, sort.average(salary));
    }

    // todo: save the max and min salary.
}
