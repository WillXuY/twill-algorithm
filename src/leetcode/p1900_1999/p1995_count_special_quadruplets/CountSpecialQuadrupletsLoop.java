package leetcode.p1900_1999.p1995_count_special_quadruplets;

public class CountSpecialQuadrupletsLoop implements CountSpecialQuadruplets {
    @Override
    public int countQuadruplets(int[] nums) {
        int output = 0;
        for (int a = 0; a < nums.length - 3; a++) {
            for (int b = a + 1; b < nums.length - 2; b++) {
                for (int c = b + 1; c < nums.length - 1; c++) {
                    for (int d = c + 1; d < nums.length; d++) {
                        if (nums[a] + nums[b] + nums[c] == nums[d]) {
                            output++;
                        }
                    }
                }
            }
        }
        return output;
    }
}
