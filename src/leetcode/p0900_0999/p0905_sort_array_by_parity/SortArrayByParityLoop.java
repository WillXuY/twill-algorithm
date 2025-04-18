package leetcode.p0900_0999.p0905_sort_array_by_parity;

public class SortArrayByParityLoop implements SortArrayByParity {
    /**
     * 1. Loop nums and judge parity of nums[i].
     * 2. Save the index of odd integers oddIndex.
     * 3. Exchange nums[i] and nums[oddIndex].
     * 4. OddIndex++;
     */
    @Override
    public int[] sortArrayByParity(int[] nums) {
        int oddIndex = -1;
        for (int i = 0; i < nums.length; i++) {
            if ((nums[i] & 1) == 1) {
                if (oddIndex == -1) {
                    oddIndex = i;
                }
            } else if (oddIndex != -1) {
                nums[i] = nums[i] ^ nums[oddIndex];
                nums[oddIndex] = nums[i] ^ nums[oddIndex];
                nums[i] = nums[i] ^ nums[oddIndex];
                oddIndex++;
            }
        }
        return nums;
    }
}
