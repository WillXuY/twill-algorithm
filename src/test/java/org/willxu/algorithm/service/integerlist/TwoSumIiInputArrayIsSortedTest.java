package org.willxu.algorithm.service.integerlist;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integerlist.TwoSumIiInputArrayIsSortedTraversal;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class TwoSumIiInputArrayIsSortedTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[] {2, 7, 11, 15}, 9, new int[] {1, 2}),
                arguments(new int[] {2, 3, 4}, 6, new int[] {1, 3}),
                arguments(new int[] {-1, 0}, -1, new int[] {1, 2})
        );
    }

    @ParameterizedTest(name = "Traversal {index}")
    @MethodSource("dataProvider")
    public void testTraversal(int[] numbers, int target, int[] excepted) {
        TwoSumIiInputArrayIsSorted traversal =
                new TwoSumIiInputArrayIsSortedTraversal();
        assertArrayEquals(excepted, traversal.twoSum(numbers, target));
    }
}
