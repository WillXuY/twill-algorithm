package org.willxu.algorithm.service.intlist;

import java.util.List;

public interface SequentialDigits {
    /**
     * An integer has sequential digits if and only if each digit in the
     * number is one more than the previous digit.
     * <p>
     * Return a sorted list of all the integers in the range [low, high]
     * inclusive that have sequential digits.
     *
     * @param low,high 10 <= low <= high <= 10^9
     */
    List<Integer> sequentialDigits(int low, int high);
}
