package leetcode.p0600_0699.p0633_sum_of_square_numbers;

public class SumOfSquareNumbersSqrt implements SumOfSquareNumbers {
    @Override
    public boolean judgeSquareSum(int c) {
        int sqrtC = (int) Math.sqrt(c);
        for (int i = 0; i <= sqrtC; i++) {
            int diff = c - i * i;
            double b = Math.sqrt(diff);
            if (b == (int) b) {
                return true;
            }
        }
        return false;
    }
}
