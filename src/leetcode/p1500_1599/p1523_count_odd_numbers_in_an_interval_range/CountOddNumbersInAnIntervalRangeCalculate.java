package leetcode.p1500_1599.p1523_count_odd_numbers_in_an_interval_range;

public class CountOddNumbersInAnIntervalRangeCalculate
        implements CountOddNumbersInAnIntervalRange {
    @Override
    public int countOdds(int low, int high) {
        int output = 0;
        if ((low & 1) == 1) {
            output++;
            low++;
        }
        if ((high & 1) == 1) {
            output++;
            high--;
        }
        output += (high - low) / 2;
        return output;
    }
}
