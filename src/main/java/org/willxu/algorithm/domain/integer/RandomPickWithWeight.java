package org.willxu.algorithm.domain.integer;

public interface RandomPickWithWeight {
    /**
     * You are given a 0-indexed array of positive integers w where w[i]
     * describes the weight of the i^th index.
     * <p>
     * You need to implement the function pickIndex(), which randomly
     * picks an index in the range [0, w.length - 1] (inclusive) and
     * returns it. The probability of picking an index i is w[i] / sum(w).
     * <p>
     * For example, if w = [1, 3], the probability of picking index 0 is
     * 1 / (1 + 3) = 0.25 (i.e., 25%), and the probability of picking
     * index 1 is 3 / (1 + 3) = 0.75 (i.e., 75%).
     *
     * @return 1 <= w.length <= 10^4
     *         1 <= w[i] <= 10^5
     *         pickIndex will be called at most 10^4 times.
     */
    int pickIndex();
}
