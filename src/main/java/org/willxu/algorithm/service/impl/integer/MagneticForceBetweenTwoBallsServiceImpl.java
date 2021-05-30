package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.MagneticForceBetweenTwoBallsService;

public class MagneticForceBetweenTwoBallsServiceImpl implements MagneticForceBetweenTwoBallsService {
    /**
     * 1. 数组 position 排序
     * 2. 获得 position 的有序差值数组 difference
     * 3. 把 difference 数组分为有序的 m-1 份的数组 differenceSum 使得 differenceSum 的最小值最大
     *    找到 difference 中的最小值 differenceMin，加到两侧中的较小值，
     *    操作 difference.length - (m-1)次，获取结果中的最小值
     * @param position example of difference : {4, 32, 11, 1, 1, 323, 1, 1}
     * @param m example: 6
     */
    @Override
    public int getMagneticForceBetweenTwoBalls(int[] position, int m) {
        int[] sort = sort(position);
        int[] difference = getDifference(sort);
        // 1.0 sort 中存储了指向 difference 从小到大的数据的 index；
        // 2.0 改为查找到 difference 中的最小值的 index
        int differentMinIndex = getMaxDifferenceMinSum(difference);
        while (difference.length > m - 1) {
            int lengthNew = difference.length - 1;
            // 循环，每次整合出一个新的 difference 数组，把 index 加到 index 的左右中的较小值
            int[] differenceNew = new int[lengthNew];
            if (differentMinIndex == 0) {
                differenceNew[0] = difference[0] + difference[1];
                System.arraycopy(difference, 2,
                        differenceNew, 1, lengthNew - 1);
            } else if (differentMinIndex == lengthNew) {
                System.arraycopy(difference, 0,
                        differenceNew, 0, lengthNew - 1);
                differenceNew[lengthNew - 1] = difference[lengthNew] + difference[lengthNew - 1];
            } else {
                if (difference[differentMinIndex - 1] > difference[differentMinIndex + 1]) {
                    System.arraycopy(difference, 0,
                            differenceNew, 0, differentMinIndex);
                    differenceNew[differentMinIndex] = difference[differentMinIndex]
                            + difference[differentMinIndex + 1];
                    System.arraycopy(difference, differentMinIndex + 2,
                            differenceNew, differentMinIndex + 1,
                            lengthNew - 1 - differentMinIndex);
                } else {
                    System.arraycopy(difference, 0,
                            differenceNew, 0, differentMinIndex - 1);
                    differenceNew[differentMinIndex - 1] = difference[differentMinIndex - 1]
                            + difference[differentMinIndex];
                    System.arraycopy(difference, differentMinIndex + 1,
                            differenceNew, differentMinIndex,
                            lengthNew - differentMinIndex);
                }
            }
            difference = differenceNew;
            differentMinIndex = getMaxDifferenceMinSum(difference);
        }
        return difference[differentMinIndex];
    }

    /**
     * 排序方法
     * brute force 冒泡排序法
     * @param position position
     * @return sort
     */
    private static int[] sort(int[] position) {
        // 从小到大，找到最小的数值j与第i个数值交换
        for (int i = 0; i < position.length; i++) {
            int minIndex = i;
            for (int j = i + 1; j < position.length; j++) {
                if (position[j] < position[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                position[i] = position[i] ^ position[minIndex];
                position[minIndex] = position[i] ^ position[minIndex];
                position[i] = position[i] ^ position[minIndex];
            }
        }
        return position;
    }

    private static int[] getDifference(int[] sort) {
        int differenceLength = sort.length - 1;
        int[] difference = new int[differenceLength];
        for (int i = 0; i < differenceLength; i++) {
            difference[i] = sort[i + 1] - sort[i];
        }
        return difference;
    }

    /**
     * difference[i] = 32,
     * difference[differenceSort[j]] = 4;
     * TODO 有待优化，现在代码计算出来了整个 differenceSort 只需要返回 differenceSort[0]
     * @param difference difference : {4, 32, 11, 1, 1, 323, 1, 1}
     * @return int
     */
    private static int getMaxDifferenceMinSum(int[] difference) {
        int len = difference.length;
        int[] differenceSort = new int[len];
        // 遍历 difference 获取 difference 从小到大排序的 index 数组
        for1:
        for (int i = 1; i < len; i++) {
            // i = differenceSort[j]
            // differenceSort 默认全是0, 比较插入数据只需要每次循环到 i+1 次
            for (int j = 0; j < i; j++) {
                if (difference[differenceSort[j]] > difference[i]) {
                    System.arraycopy(differenceSort, j,
                            differenceSort, j + 1, len -j - 1);
                    differenceSort[j] = i;
                    continue for1;
                }
                if (j == i - 1) {
                    differenceSort[j + 1] = i;
                }
            }
        }
        return differenceSort[0];
    }
}
