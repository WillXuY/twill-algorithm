package leetcode.p2100_2199.p2180_count_integers_with_even_digit_sum;

public class CountIntegersWithEvenDigitSumCount implements CountIntegersWithEvenDigitSum {
    @Override
    public int countEven(int num) {
        int output = 0;
        for (int i = 2; i <= num; i++) {
            if ((getDigitSum(i) & 1) == 0) {
                output++;
            }
        }
        return output;
    }

    private int getDigitSum(int num) {
        int output = 0;
        while (num > 0) {
            output += num % 10;
            num /= 10;
        }
        return output;
    }
}
