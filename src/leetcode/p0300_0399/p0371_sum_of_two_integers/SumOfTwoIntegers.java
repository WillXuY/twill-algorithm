package leetcode.p0300_0399.p0371_sum_of_two_integers;

public interface SumOfTwoIntegers {
    /**
     * Given two integers a and b, return the sum of the two integers
     * without using the operators + and -.
     * <p>
     * 2 + 3 = 5
     * 10 ^ 11 = 1
     * 10 & 11 = 10
     * 10 << 1 = 100
     * 100 ^ 1 = 101
     * 100 & 1 = 0
     *
     * @param a,b -1000 <= a, b <= 1000
     */
    int getSum(int a, int b);
}
