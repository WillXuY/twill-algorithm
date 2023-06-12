package org.willxu.algorithm.service.integer;

public interface HindexIi {
    /**
     * Given an array of integers citations where citations[i] is the
     * number of citations a researcher received for their i^th paper
     * and citations is sorted in ascending order, return the
     * researcher's h-index.
     * <p>
     * According to the definition of h-index on Wikipedia: The h-index
     * is defined as the maximum value of h such that the given
     * researcher has published at least h papers that have each been
     * cited at least h times.
     * <p>
     * You must write an algorithm that runs in logarithmic time.
     *
     * @param citations n == citations.length
     *                  1 <= n <= 105
     *                  0 <= citations[i] <= 1000
     *                  citations is sorted in ascending order.
     */
    int hIndex(int[] citations);
}
