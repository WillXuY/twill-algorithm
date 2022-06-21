package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.CalculateMoneyInLeetcodeBank;

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
