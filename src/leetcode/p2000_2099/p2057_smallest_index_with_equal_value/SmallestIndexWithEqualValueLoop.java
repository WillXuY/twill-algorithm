package leetcode.p2000_2099.p2057_smallest_index_with_equal_value;

public class SmallestIndexWithEqualValueLoop
        implements SmallestIndexWithEqualValue {
    @Override
    public int smallestEqual(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (i % 10 == nums[i]) {
                return i;
            }
        }
        return -1;
    }
}
