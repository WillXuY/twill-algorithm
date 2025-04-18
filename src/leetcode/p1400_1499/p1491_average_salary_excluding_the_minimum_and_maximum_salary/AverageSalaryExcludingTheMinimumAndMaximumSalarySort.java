package org.willxu.algorithm.service.impl.doublepoint;

import org.willxu.algorithm.service.doublepoint.AverageSalaryExcludingTheMinimumAndMaximumSalary;

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
