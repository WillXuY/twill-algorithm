package leetcode.p0700_0799.p0769_max_chunks_to_make_sorted;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxChunksToMakeSortedTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.arguments(new int[] {0}, 1),
                Arguments.arguments(new int[] {2, 6, 1, 3, 0, 5, 4}, 1),
                Arguments.arguments(new int[] {5, 2, 0, 3, 1, 4, 6}, 2),
                Arguments.arguments(new int[] {2, 0, 1, 3}, 2),
                Arguments.arguments(new int[] {2, 0, 1}, 1),
                Arguments.arguments(new int[] {1, 4, 0, 2, 3, 5}, 2),
                Arguments.arguments(new int[] {4, 3, 2, 1, 0}, 1),
                Arguments.arguments(new int[] {1, 0, 2, 3, 4}, 4)
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(int[] arr, int expected) {
        MaxChunksToMakeSorted loop = new MaxChunksToMakeSortedLoop();
        assertEquals(expected, loop.maxChunksToSorted(arr));
    }
}
