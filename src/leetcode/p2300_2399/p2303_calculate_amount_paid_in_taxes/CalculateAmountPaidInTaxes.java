package leetcode.p2300_2399.p2303_calculate_amount_paid_in_taxes;

public interface CalculateAmountPaidInTaxes {
    /**
     * You are given a 0-indexed 2D integer array brackets where
     * brackets[i] = [upper_i, percent_i] means that the ith tax bracket
     * has an upper bound of upper_i and is taxed at a rate of percent_i.
     * The brackets are sorted by upper bound (i.e. upper_i-1 < upper_i
     * for 0 < i < brackets.length).
     * <p>
     * Tax is calculated as follows:
     * <p>
     * - The first upper0 dollars earned are taxed at a rate of percent0
     * - The next upper1 - upper0 dollars earned are taxed at a rate of
     *   percent1.
     * - The next upper2 - upper1 dollars earned are taxed at a rate of
     *   percent2.
     * - And so on.
     * <p>
     * You are given an integer income representing the amount of money
     * you earned. Return the amount of money that you have to pay in
     * taxes. Answers within 10-5 of the actual answer will be accepted.
     *
     * @param brackets 1 <= brackets.length <= 100
     *                 1 <= upper_i <= 1000
     *                 0 <= percent_i <= 100
     *                 0 <= income <= 1000
     *                 upper_i is sorted in ascending order.
     *                 All the values of upper_i are unique.
     * @param income The upper bound of the last tax bracket is greater
     *              than or equal to income.
     */
    double calculateTax(int[][] brackets, int income);
}
