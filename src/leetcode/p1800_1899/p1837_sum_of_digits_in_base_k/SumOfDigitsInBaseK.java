package leetcode.p1800_1899.p1837_sum_of_digits_in_base_k;

public interface SumOfDigitsInBaseK {
    /**
     * Given an integer n (in base 10) and a base k, return the sum of
     * the digits of n after converting n from base 10 to base k.
     *
     * After converting, each digit should be interpreted as a base 10
     * number, and the sum should be returned in base 10.
     *
     * @param n 1 <= n <= 100
     * @param k 2 <= k <= 10
     */
    int sumBase(int n, int k);
}
