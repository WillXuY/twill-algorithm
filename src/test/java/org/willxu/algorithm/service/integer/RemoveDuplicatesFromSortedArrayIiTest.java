package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.RemoveDuplicatesFromSortedArrayIiIndex;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class RemoveDuplicatesFromSortedArrayIiTest {
     static Stream<Arguments> dataProvider() {
         return Stream.of(
                 arguments(
                         new int[] {1, 1, 1, 2, 2, 3},
                         5,
                         new int[] {1, 1, 2, 2, 3}
                 ),
                 arguments(
                         new int[] {0, 0, 1, 1, 1, 1, 2, 3, 3},
                         7,
                         new int[] {0, 0, 1, 1, 2, 3, 3}
                 )
         );
     }

     @ParameterizedTest(name = "Index {index}")
     @MethodSource("dataProvider")
     public void testIndex(int[] nums, int length, int[] expected) {
         RemoveDuplicatesFromSortedArrayIi index =
                 new RemoveDuplicatesFromSortedArrayIiIndex();
         int output = index.removeDuplicates(nums);
         assertArrayEquals(Arrays.copyOfRange(expected, 0, length),
                 Arrays.copyOfRange(nums, 0, output));
     }
}
