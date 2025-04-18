package leetcode.p0000_0099.p0031_next_permutation;

public interface NextPermutation {
    /**
     * A permutation of an array of integers is an arrangement of its
     * members into a sequence or linear order.
     * <p>
     * - For example, for arr = [1,2,3], the following are all the
     *   permutations of arr: [1,2,3], [1,3,2], [2, 1, 3], [2, 3, 1],
     *   [3,1,2], [3,2,1].
     * <p>
     * The next permutation of an array of integers is the next
     * lexicographically greater permutation of its integer. More
     * formally, if all the permutations of the array are sorted in one
     * container according to their lexicographical order, then the next
     * permutation of that array is the permutation that follows it in
     * the sorted container. If such arrangement is not possible, the
     * array must be rearranged as the lowest possible order
     * (i.e., sorted in ascending order).
     * <p>
     * - For example, the next permutation of arr = [1,2,3] is [1,3,2].
     * - Similarly, the next permutation of arr = [2,3,1] is [3,1,2].
     * - While the next permutation of arr = [3,2,1] is [1,2,3] because
     *   [3,2,1] does not have a lexicographical larger rearrangement.
     * <p>
     * Given an array of integers nums, find the next permutation of
     * nums.
     * <p>
     * The replacement must be in place and use only constant extra
     * memory.
     *
     * @param nums 1 <= nums.length <= 100
     *             0 <= nums[i] <= 100
     */
    void nextPermutation(int[] nums);
}
