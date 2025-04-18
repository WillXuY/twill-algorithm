package leetcode.p1700_1799.p1716_calculate_money_in_leetcode_bank;

public class CalculateMoneyInLeetcodeBankCalculate
        implements CalculateMoneyInLeetcodeBank {
    @Override
    public int totalMoney(int n) {
        int remainder = n % 7;
        int numberOfFullWeeks = n / 7;
        int firstWeek = 28;
        int output = (firstWeek * 2 + 7 * (numberOfFullWeeks - 1))
                * numberOfFullWeeks / 2;
        output += (1 + numberOfFullWeeks * 2 + remainder) * remainder / 2;
        return output;
    }
}
