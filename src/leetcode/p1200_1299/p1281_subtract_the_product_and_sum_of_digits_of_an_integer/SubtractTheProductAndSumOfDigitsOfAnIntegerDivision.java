package leetcode.p1200_1299.p1281_subtract_the_product_and_sum_of_digits_of_an_integer;

public class SubtractTheProductAndSumOfDigitsOfAnIntegerDivision
        implements SubtractTheProductAndSumOfDigitsOfAnInteger {
    @Override
    public int subtractProductAndSum(int n) {
        int product = 1;
        int sum = 0;
        while (n > 0) {
            int remainder = n % 10;
            sum += remainder;
            product *= remainder;
            n /= 10;
        }
        return product - sum;
    }
}
