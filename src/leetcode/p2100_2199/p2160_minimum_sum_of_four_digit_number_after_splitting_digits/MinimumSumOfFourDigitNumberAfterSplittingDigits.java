package leetcode.p2100_2199.p2160_minimum_sum_of_four_digit_number_after_splitting_digits;

public interface MinimumSumOfFourDigitNumberAfterSplittingDigits {
    /**
     * You are given a positive integer num consisting of exactly four
     * digits. Split num into two new integers new1 and new2 by using
     * the digits found in num. Leading zeros are allowed in new1 and
     * new2, and all the digits found in num must be used.
     * <p>
     * - For example, given num = 2932, you have the following digits:
     *   two 2's, one 9 and one 3. Some of the possible pairs
     *   [new1, new2] are [22, 93], [23, 92], [223, 9] and [2, 329].
     * <p>
     * Return the minimum possible sum of new1 and new2.
     *
     * @param num 1000 <= num <= 9999
     */
    int minimumSum(int num);
}
