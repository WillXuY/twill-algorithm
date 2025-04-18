package leetcode.p1900_1999.p1920_build_array_from_permutation;

public class BuildArrayFromPermutationLoop
        implements BuildArrayFromPermutation {
    @Override
    public int[] buildArray(int[] nums) {
        int[] output = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            output[i] = nums[nums[i]];
        }
        return output;
    }
}
