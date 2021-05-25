package org.willxu.algorithm.service.integerarray2integer;

import org.gradle.internal.impldep.org.junit.Assert;
import org.gradle.internal.impldep.org.junit.Before;
import org.gradle.internal.impldep.org.junit.runner.RunWith;
import org.gradle.internal.impldep.org.junit.runners.Parameterized;
import org.willxu.algorithm.service.impl.integerarray2integer.BurstBalloonsWrongImpl;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

@RunWith(Parameterized.class)
public class BurstBalloonsTest {
    private BurstBalloonsService burstBalloonsWrong;

    private final int[] input;
    private final int output;

    public BurstBalloonsTest(int[] input, int output) {
        this.input = input;
        this.output = output;
    }

    /**
     * Example:
     * Input: [3, 1, 5, 8]
     * Output: 167
     * Explanation: nums = [3, 1, 5, 8] --> [3, 5, 8] --> [3, 8] --> [8] --> []
     *             coins =   3*1*5      +     3*5*8   +  1*3*8   +  1*8*1 = 167
     */
    @Parameterized.Parameters(name = "Test Param index: {index}")
    public static List<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {new int[]{3, 1, 5, 8}, 167},
                {new int[]{1, 5}, 10}
        });
    }

    @Before
    public void init() {
        burstBalloonsWrong = new BurstBalloonsWrongImpl();
    }

    @Test
    public void testGetBurstBalloons() {
        Assert.assertEquals(output, burstBalloonsWrong.getBurstBalloons(input));
    }
}
