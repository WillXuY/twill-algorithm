package leetcode.p1400_1499.p1491_average_salary_excluding_the_minimum_and_maximum_salary;

import java.util.Arrays;

public class AverageSalaryExcludingTheMinimumAndMaximumSalarySort
        implements AverageSalaryExcludingTheMinimumAndMaximumSalary {
    @Override
    public double average(int[] salary) {
        Arrays.sort(salary);
        double sum = 0.0;
        for (int i = 1; i < salary.length - 1; i++) {
           sum += salary[i];
        }
        return sum / (salary.length - 2);
    }
}
