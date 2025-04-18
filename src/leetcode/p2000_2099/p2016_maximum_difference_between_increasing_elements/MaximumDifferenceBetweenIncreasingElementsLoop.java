package leetcode.p2000_2099.p2016_maximum_difference_between_increasing_elements;

public class MaximumDifferenceBetweenIncreasingElementsLoop
        implements MaximumDifferenceBetweenIncreasingElements {
    @Override
    public int maximumDifference(int[] nums) {
        int output = -1;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int diff = nums[j] - nums[i];
                if (diff > 0 && diff > output) {
                    output = diff;
                }
            }
        }
        return output;
    }
}
