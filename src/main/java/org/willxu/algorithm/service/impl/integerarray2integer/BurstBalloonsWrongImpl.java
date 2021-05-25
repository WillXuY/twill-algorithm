package org.willxu.algorithm.service.impl.integerarray2integer;

import org.willxu.algorithm.service.integerarray2integer.BurstBalloonsService;

public class BurstBalloonsWrongImpl implements BurstBalloonsService {
    /**
     * # 1. 初步考虑：
     * - first remove all the 0 balloons
     * - then burst 1 balloons except index 0 and n-1;
     * # 2. 猜测： 从小到大一个一个移除
     * @param nums numbers
     * @return sum
     */
    @Override
    public int getBurstBalloons(int[] nums) {
        int length = nums.length;
        // 移除所有的 0;
        for (int i = 0; i < length; i++) {
            if (nums[i] == 0) {
                nums = remove(nums, i);
                i--;
                length--;
            }
        }
        // remove the 1, add to result
        int result = 0;
        for (int i = 0; i < length; i++) {
            if (nums[i] == 1) {
                if (i == 0) {
                    result += nums[0] * nums[1];
                } else if (i == length - 1) {
                    result += nums[i - 1] * nums[i];
                } else {
                    result += nums[i - 1] * nums[i] * nums[i + 1];
                }
                nums = remove(nums, i);
                i--;
                length--;
            }
        }
        while (nums.length > 2) {
            int minIndex = getMinIndexExceptFirstAndEnd(nums);
            result += nums[minIndex - 1] * nums[minIndex]
                    * nums[minIndex + 1];
            nums = remove(nums, minIndex);
        }
        result += nums[0] * nums[1];
        result += Math.max(nums[0], nums[1]);
        return result;
    }

    private static int getMinIndexExceptFirstAndEnd(int[] nums) {
        int resultIndex = 1;
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[resultIndex] > nums[i]) {
                resultIndex = i;
            }
        }
        return resultIndex;
    }

    private static int[] remove(int[] nums, int index) {
        int length = nums.length;
        if (length <= index || index < 0) {
            throw new RuntimeException("index out of range");
        } else if (length == 1) {
            return new int[0];
        }
        int[] result = new int[length - 1];
        System.arraycopy(nums, 0, result, 0, index);
        System.arraycopy(nums, index + 1, result, index,
                length - 1 - index);
        return result;
    }
}
