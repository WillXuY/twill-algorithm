package leetcode.p2400_2499.p2455_average_value_of_even_numbers_that_are_divisible_by_three;

public class AverageValueOfEvenNumbersThatAreDivisibleByThreeCount
        implements AverageValueOfEvenNumbersThatAreDivisibleByThree {
    @Override
    public int averageValue(int[] nums) {
        int sum = 0;
        int count = 0;
        for (int n: nums) {
            if (n % 3 == 0 && (n & 1) == 0) {
                sum += n;
                count++;
            }
        }
        if (count == 0) {
            return 0;
        } else {
            return sum / count;
        }
    }
}
