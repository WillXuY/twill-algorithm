package leetcode.p0200_0299.p0263_ugly_number;

public interface UglyNumber {
    /**
     * An ugly number is a positive integer whose prime factors are
     * limited to 2, 3 and 5.
     *
     * Given an integer n, return true if n is an ugly number.
     *
     * @param n -2^31 <= n <= 2^31 - 1
     * @return is ugly number or not.
     */
    boolean isUgly(int n);
}
