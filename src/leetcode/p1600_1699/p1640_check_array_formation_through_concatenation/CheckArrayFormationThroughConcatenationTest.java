package leetcode.p1600_1699.p1640_check_array_formation_through_concatenation;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CheckArrayFormationThroughConcatenationTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[] {12}, new int[][] {{1}}, false),
                arguments(new int[] {15, 88}, new int[][] {{88}, {15}}, true),
                arguments(
                        new int[] {49, 18, 16},
                        new int[][] {{16, 18, 49}},
                        false
                ),
                arguments(
                        new int[] {91, 4, 64, 78},
                        new int[][] {{78}, {4, 64}, {91}},
                        true
                )
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(int[] arr, int[][] pieces, boolean expected) {
        CheckArrayFormationThroughConcatenation loop =
                new CheckArrayFormationThroughConcatenationLoop();
        assertEquals(expected, loop.canFormArray(arr, pieces));
    }
}
