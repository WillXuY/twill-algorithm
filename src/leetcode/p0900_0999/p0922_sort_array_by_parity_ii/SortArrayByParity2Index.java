package leetcode.p0900_0999.p0922_sort_array_by_parity_ii;

public class SortArrayByParity2Index implements SortArrayByParity2 {
    /**
     * 1. Save the boolean[] needChange = new boolean[nums.length].
     * 2. Define oddIndex = 1, evenIndex = 0.
     * 3. Loop: index i
     *    if i is even
     *      if nums[i] is even, continue.
     *      else
     *        if (can exchange)
     *          exchange, change oddIndex and evenIndex.
     *        else
     *          save needChange info.
     *
     */
    @Override
    public int[] sortArrayByParityII(int[] nums) {
        boolean[] needChange = new boolean[nums.length];
        int oddIndex = -1, evenIndex = -1;
        for (int i = 0; i < nums.length; i++) {
            if ((i & 1) == 1) {
                // i is odd.
                if ((nums[i] & 1) == 0) {
                    if (evenIndex != -1) {
                        nums[evenIndex] = nums[i] ^ nums[evenIndex];
                        nums[i] = nums[i] ^ nums[evenIndex];
                        nums[evenIndex] = nums[i] ^ nums[evenIndex];
                        // get next evenIndex index to change
                        int old = evenIndex;
                        for (int e = evenIndex + 2; e < i; e++) {
                            if (needChange[e]) {
                                evenIndex = e;
                                break;
                            }
                        }
                        if (old == evenIndex) {
                            evenIndex = -1;
                        }
                    } else {
                        needChange[i] = true;
                        if (oddIndex == -1) {
                            oddIndex = i;
                        }
                    }
                }
            } else if ((nums[i] & 1) == 1){
                if (oddIndex != -1) {
                    nums[oddIndex] = nums[i] ^ nums[oddIndex];
                    nums[i] = nums[i] ^ nums[oddIndex];
                    nums[oddIndex] = nums[i] ^ nums[oddIndex];
                    int old = oddIndex;
                    for (int o = oddIndex + 2; o < i; o++) {
                        if (needChange[o]) {
                            oddIndex = o;
                            break;
                        }
                    }
                    if (old == oddIndex) {
                        oddIndex = -1;
                    }
                } else {
                    needChange[i] = true;
                    if (evenIndex == -1) {
                        evenIndex = i;
                    }
                }
            }
        }
        return nums;
    }
}
