package org.willxu.algorithm.service.strlist;

import java.util.List;

public interface BuildAnArrayWithStackOperations {
    /**
     * You are given an array target and an integer n.
     * In each iteration, you will read a number from list =
     * [1, 2, 3, ..., n].
     * Build the target array using the following operations:
     * - "Push": Reads a new element from the beginning list, and pushes
     *   it in the array.
     * - "Pop": Deletes the last element of the array.
     * - If the target array is already built, stop reading more
     *   elements.
     * Return a list of the operations needed to build target. The test
     * cases are generated so that the answer is unique.
     * Constraints:
     * target is strictly increasing.
     *
     * @param target 1 <= target.length <= 100
     * @param n 1 <= n <= 100
     *          1 <= target[i] <= n
     * @return Push and Pop string list to build target.
     */
    List<String> buildArray(int[] target, int n);
}
