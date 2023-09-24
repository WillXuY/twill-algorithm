package org.willxu.algorithm.service.ints;

import org.junit.jupiter.api.Test;
import org.willxu.algorithm.service.impl.ints.RandomFlipMatrixSet;

import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class RandomFlipMatrixTest {
    @Test
    public void testSet() {
        RandomFlipMatrix set = new RandomFlipMatrixSet(3, 1);
        Set<String> possibleSet = Stream.of(
                "0,0", "1,0", "2,0"
        ).collect(Collectors.toSet());
        int[] output1 = set.flip();
        assertTrue(possibleSet.contains(output1[0] + "," + output1[1]));
        int[] output2 = set.flip();
        assertTrue(possibleSet.contains(output2[0] + "," + output2[1]));
        int[] output3 = set.flip();
        assertTrue(possibleSet.contains(output3[0] + "," + output3[1]));
        set.reset();
        int[] output4 = set.flip();
        assertTrue(possibleSet.contains(output4[0] + "," + output4[1]));
    }
}
