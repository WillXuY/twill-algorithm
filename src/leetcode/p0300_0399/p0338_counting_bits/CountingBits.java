package leetcode.p0300_0399.p0338_counting_bits;

public interface CountingBits {
    /**
     * Given an integer n, return an array ans of length n + 1 such that
     * for each i (0 <= i <= n), ans[i] is the number of 1's in the
     * binary representation of i.
     *
     * @param n 0 <= n <= 10^5
     * @return the number of 1.
     */
    int[] countBits(int n);
}
