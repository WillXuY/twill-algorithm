package leetcode.p1200_1299.p1295_find_numbers_with_even_number_of_digits;

public class FindNumbersWithEvenNumberOfDigitsDivision
        implements FindNumbersWithEvenNumberOfDigits {
    @Override
    public int findNumbers(int[] nums) {
        int output = 0;
        for (int n: nums) {
            if ((getNumberOfBits(n) & 1) == 0) {
                output++;
            }
        }
        return output;
    }

    private int getNumberOfBits(int num) {
        int output = 0;
        while (num > 0) {
            output++;
            num /= 10;
        }
        return output;
    }
}
