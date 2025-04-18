package leetcode.p1600_1699.p1608_special_array_withx_elements_greater_than_or_equalx;

import java.util.Arrays;

public class SpecialArrayWithxElementsGreaterThanOrEqualxSort
        implements SpecialArrayWithxElementsGreaterThanOrEqualX {
    @Override
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int numberLeft = nums.length - i;
            if (numberLeft <= nums[i]) {
                if (i > 0 && nums[i - 1] >= numberLeft) {
                    return -1;
                }
                return numberLeft;
            }
        }
        return -1;
    }
}
