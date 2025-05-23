package leetcode.p1700_1799.p1716_calculate_money_in_leetcode_bank;

public interface CalculateMoneyInLeetcodeBank {
    /**
     * Hercy wants to save money for his first car. He puts money in the
     * Leetcode bank every day.
     *
     * He starts by putting in $1 on Monday, the first day. Every day
     * from Tuesday to Sunday, he will put in $1 more than the day
     * before. On every subsequent Monday, he will put in $1 more than
     * the previous Monday.
     * Given n, return the total amount of money he will have in the
     * Leetcode bank at the end of the nth day.
     *
     * @param n 1 <= n <= 1000
     */
    int totalMoney(int n);
}
