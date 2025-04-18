package leetcode.p1300_1399.p1365_how_many_numbers_are_smaller_than_the_current_number;

public interface HowManyNumbersAreSmallerThanTheCurrentNumber {
    /**
     * Given the array nums, for each nums[i] find out how many numbers
     * in the array are smaller than it. That is, for each nums[i] you
     * have to count the number of valid j's such that j != i and
     * nums[j] < nums[i].
     * Return the answer in a array.
     *
     * @param nums 2 <= nums.length <= 500
     *             0 <= nums[i] <= 100
     * @return how many numbers in the array are smaller than it.
     */
    int[] smallerNumbersThanCurrent(int[] nums);
}
