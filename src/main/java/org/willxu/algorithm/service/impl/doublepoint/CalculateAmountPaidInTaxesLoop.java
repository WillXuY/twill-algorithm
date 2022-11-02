package org.willxu.algorithm.service.impl.doublepoint;

import org.willxu.algorithm.service.doublepoint.CalculateAmountPaidInTaxes;

public class CalculateAmountPaidInTaxesLoop
        implements CalculateAmountPaidInTaxes {
    @Override
    public double calculateTax(int[][] brackets, int income) {
        double output = 0;
        int last = 0;
        for(int[] b: brackets) {
            if (income < b[0]) {
                output += (double) (income - last) * b[1] / 100;
                break;
            }
            output += (double) (b[0] - last) * b[1] / 100;
            last = b[0];
        }
        return output;
    }
}
