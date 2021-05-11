package com.willxu.algorithm.service.integerarray2integer;

import com.willxu.algorithm.service.impl.integerarray2integer.BurstBalloonsWrongImpl;
import org.junit.jupiter.api.Test;

public class BurstBalloonsTest {
    private final BurstBalloonsService burstBalloonsWrong = new BurstBalloonsWrongImpl();

    /**
     * Example:
     * Input: [3, 1, 5, 8]
     * Output: 167
     * Explanation: nums = [3, 1, 5, 8] --> [3, 5, 8] --> [3, 8] --> [8] --> []
     *             coins =   3*1*5      +     3*5*8   +  1*3*8   +  1*8*1 = 167
     */
    @Test
    public void testGetBurstBalloons() {
        int[] input = {3, 1, 5, 8};
        int output = burstBalloonsWrong.getBurstBalloons(input);
        System.out.println(output);
    }
}
