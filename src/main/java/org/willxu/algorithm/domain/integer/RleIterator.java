package org.willxu.algorithm.domain.integer;

/**
 * We can use run-length encoding (i.e., RLE) to encode a sequence of
 * integers. In a run-length encoded array of even length encoding
 * (0-indexed), for all even i, encoding[i] tells us the number of times
 * that the non-negative integer value encoding[i + 1] is repeated in
 * the sequence.
 * <p>
 * - For example, the sequence arr = [8,8,8,5,5] can be encoded to be
 *   encoding = [3,8,2,5]. encoding = [3,8,0,9,2,5] and
 *   encoding = [2,8,1,8,2,5] are also valid RLE of arr.
 * <p>
 * Given a run-length encoded array, design an iterator that iterates
 * through it.
 * <p>
 * Implement the RLEIterator class:
 * <p>
 * - RLEIterator(int[] encoded) Initializes the object with the encoded
 *   array encoded.
 * - int next(int n) Exhausts the next n elements and returns the last
 *   element exhausted in this way. If there is no element left to
 *   exhaust, return -1 instead.
 * <p>
 * - 2 <= encoding.length <= 1000
 * - encoding.length is even.
 * - 0 <= encoding[i] <= 10^9
 * public RLEIterator(int[] encoding);
 * - At most 1000 calls will be made to next.
 */
public interface RleIterator {
    /**
     * @param n 1 <= n <= 10^9
     */
    int next(int n);
}
