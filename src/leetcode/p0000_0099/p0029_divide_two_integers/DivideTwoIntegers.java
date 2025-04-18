package leetcode.p0000_0099.p0029_divide_two_integers;

public interface DivideTwoIntegers {
    /**
     * Given two integers dividend and divisor, divide two integers
     * without using multiplication, division, and mod operator.
     * <p>
     * The integer division should truncate toward zero, which means
     * losing its fractional part. For example, 8.345 would be truncated
     * to 8, and -2.7335 would be truncated to -2.
     * <p>
     * Return the quotient after dividing dividend by divisor.
     * <p>
     * Note: Assume we are dealing with an environment that could only
     * store integers within the 32-bit signed integer range:
     * [−2^31, 2^31 − 1]. For this problem, if the quotient is strictly
     * greater than 2^31 - 1, then return 2^31 - 1, and if the quotient
     * is strictly less than -2^31, then return -2^31.
     *
     * @param dividend -2^31 <= dividend, divisor <= 2^31 - 1
     * @param divisor divisor != 0
     */
    int divide(int dividend, int divisor);
}
