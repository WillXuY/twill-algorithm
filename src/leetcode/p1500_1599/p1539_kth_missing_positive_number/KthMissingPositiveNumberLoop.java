package leetcode.p1500_1599.p1539_kth_missing_positive_number;

public class KthMissingPositiveNumberLoop implements KthMissingPositiveNumber {
    @Override
    public int findKthPositive(int[] arr, int k) {
        int count = 0;
        int output = 1;
        for (int i: arr) {
            while (output < i) {
                count++;
                if (count == k) {
                    return output;
                }
                output++;
            }
            output++;
        }
        return output + k - count - 1;
    }
}
