package leetcode.p1900_1999.p1991_find_the_middle_index_in_array;

public class FindTheMiddleIndexInArraySum implements FindTheMiddleIndexInArray {
    @Override
    public int findMiddleIndex(int[] nums) {
        int[] sum = new int[nums.length];
        sum[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sum[i] = sum[i - 1] + nums[i];
        }
        for (int i = 0; i < sum.length; i++) {
            int left = sum[i] - nums[i];
            int right = sum[sum.length - 1] - sum[i];
            if (left == right) {
                return i;
            }
        }
        return -1;
    }
}
