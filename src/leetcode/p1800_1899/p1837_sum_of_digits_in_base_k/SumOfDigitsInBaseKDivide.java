package leetcode.p1800_1899.p1837_sum_of_digits_in_base_k;

public class SumOfDigitsInBaseKDivide implements SumOfDigitsInBaseK {
    @Override
    public int sumBase(int n, int k) {
        int output = 0;
        while (n > 0) {
            output += n % k;
            n /= k;
        }
        return output;
    }
}
