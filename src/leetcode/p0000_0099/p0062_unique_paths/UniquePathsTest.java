package leetcode.p0000_0099.p0062_unique_paths;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class UniquePathsTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(3, 7, 28),
                arguments(3, 2, 3)
        );
    }

    @ParameterizedTest(name = "Matrix {index}")
    @MethodSource("dataProvider")
    public void testMatrix(int m, int n, int expected) {
        UniquePaths matrix = new UniquePathsMatrix();
        assertEquals(expected, matrix.uniquePaths(m, n));
    }
}
