package leetcode.p0400_0499.p0414_third_maximum_number;

public class ThirdMaximumNumberCompare implements ThirdMaximumNumber {
    @Override
    public int thirdMax(int[] nums) {
        int first = nums[0];
        int second = nums[0];
        int third = nums[0];
        if (nums.length > 1) {
            if (nums[1] > first) {
                third = nums[1];
                first = nums[1];
            } else {
                second = nums[1];
            }
        }
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] == first || nums[i] == second || nums[i] == third) {
                continue;
            }
            if (nums[i] > first) {
                third = second;
                second = first;
                first = nums[i];
            } else if (nums[i] > second) {
                third = second;
                second = nums[i];
            } else if (nums[i] > third) {
                third = nums[i];
            }
            if (third == first || third == second) {
                third = nums[i];
            }
        }
        if (first == second) {
            return first;
        } else {
            return third;
        }
    }
}
