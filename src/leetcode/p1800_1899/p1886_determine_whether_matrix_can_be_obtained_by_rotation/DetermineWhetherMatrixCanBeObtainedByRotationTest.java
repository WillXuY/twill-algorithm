package leetcode.p1800_1899.p1886_determine_whether_matrix_can_be_obtained_by_rotation;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class DetermineWhetherMatrixCanBeObtainedByRotationTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        new int[][] {{0, 1}, {1, 1}},
                        new int[][] {{1, 0}, {0, 1}},
                        false
                ),
                arguments(
                        new int[][] {{0, 0, 0}, {0, 1, 0}, {1, 1, 1}},
                        new int[][] {{1, 1, 1}, {0, 1, 0}, {0, 0, 0}},
                        true
                )
        );
    }

    @ParameterizedTest(name = "Four {index}")
    @MethodSource("dataProvider")
    public void testFour(int[][] mat, int[][] target, boolean expected) {
        DetermineWhetherMatrixCanBeObtainedByRotation four =
                new DetermineWhetherMatrixCanBeObtainedByRotationFour();
        assertEquals(expected, four.findRotation(mat, target));
    }
}
