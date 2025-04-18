package leetcode.p1900_1999.p1920_build_array_from_permutation;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class BuildArrayFromPermutationTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        new int[] {0, 2, 1, 5, 3, 4},
                        new int[] {0, 1, 2, 4, 5, 3}
                ),
                arguments(
                        new int[] {5, 0, 1, 2, 3, 4},
                        new int[] {4, 5, 0, 1, 2, 3}
                )
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(int[] nums, int[] expected) {
        BuildArrayFromPermutation loop = new BuildArrayFromPermutationLoop();
        assertArrayEquals(expected, loop.buildArray(nums));
    }
}
