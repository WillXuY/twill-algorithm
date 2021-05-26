package org.willxu.algorithm.service.ints2int;

import org.willxu.algorithm.service.impl.ints2int.MagneticForceBetweenTwoBallsServiceImpl;
import org.junit.jupiter.api.Test;

public class MagneticForceBetweenTwoBallsTest {
    private final MagneticForceBetweenTwoBallsService bruteForce = new MagneticForceBetweenTwoBallsServiceImpl();

    @Test
    public void testGetMagneticForceBetweenTwoBalls() {
        // 输入任意数组 difference
        int[] position = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        // 输入任意整数 m < difference.length = 8;
        int m = 4;
        // 返回 difference 的按顺序组合求和数组 sum 使得 sum.length = m,
        // 且 sum 的最小值 min 最大,返回 min
        // 如本例 4; 32; 11; 1+1; 323; 1+1; sum = {4, 32, 11, 2, 323, 2}; min = 2;
        int output = bruteForce.getMagneticForceBetweenTwoBalls(position, m);
        System.out.println(output);
    }
}
