package leetcode.p1300_1399.p1304_find_unique_integers_sum_up_to_zero;

public class FindUniqueIntegersSumUpToZeroSymmetry
        implements FindUniqueIntegersSumUpToZero {
    @Override
    public int[] sumZero(int n) {
        int subtrahend = 1;
        int[] output = new int[n];
        for (int i = 0; i < n / 2; i++) {
            output[i] += subtrahend;
            output[n - 1 - i] -= subtrahend;
            subtrahend++;
        }
        return output;
    }
}
