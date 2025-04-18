package leetcode.p0000_0099.p0031_next_permutation;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class NextPermutationTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[] {1, 5, 1}, new int[] {5, 1, 1}),
                arguments(new int[] {2, 3, 1}, new int[] {3, 1, 2}),
                arguments(new int[] {1}, new int[] {1}),
                arguments(new int[] {1, 3, 2}, new int[] {2, 1, 3}),
                arguments(new int[] {1, 2, 3}, new int[] {1, 3, 2}),
                arguments(new int[] {3, 2, 1}, new int[] {1, 2, 3}),
                arguments(new int[] {1, 1, 5}, new int[] {1, 5, 1})
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(int[] nums, int[] expected) {
        NextPermutation loop = new NextPermutationLoop();
        loop.nextPermutation(nums);
        assertArrayEquals(expected, nums);
    }
}
