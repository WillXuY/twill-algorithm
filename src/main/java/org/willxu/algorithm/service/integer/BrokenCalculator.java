package org.willxu.algorithm.service.integer;

public interface BrokenCalculator {
    /**
     * There is a broken calculator that has the integer startValue on
     * its display initially. In one operation, you can:
     * <p>
     * - multiply the number on display by 2, or
     * - subtract 1 from the number on display.
     * <p>
     * Given two integers startValue and target, return the minimum
     * number of operations needed to display target on the calculator.
     *
     * @param startValue,target 1 <= startValue, target <= 10^9
     */
    int brokenCalc(int startValue, int target);
}
