package leetcode.p1300_1399.p1343_number_of_sub_arrays_of_size_and_average_greater_than_or_equal_to_threshold;

public class NumberOfSubArraysOfSizeAndAverageGreaterThanOrEqualToThresholdLoop
        implements NumberOfSubArraysOfSizeAndAverageGreaterThanOrEqualToThreshold {
    @Override
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int goal = k * threshold;
        int result = 0;
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        if (sum >= goal) {
            result += 1;
        }
        for (int i = k; i < arr.length; i++) {
            sum -= arr[i - k];
            sum += arr[i];
            if (sum >= goal) {
                result += 1;
            }
        }
        return result;
    }
}
