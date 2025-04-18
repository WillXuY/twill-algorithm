package leetcode.p0000_0099.p0072_edit_distance;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EditDistanceTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.arguments("horse", "ros", 3),
                Arguments.arguments("intention", "execution", 5)
        );
    }

    @ParameterizedTest(name = "Matrix {index}")
    @MethodSource("dataProvider")
    public void testMatrix(String word1, String word2, int expected) {
        EditDistance matrix = new EditDistanceMatrix();
        assertEquals(expected, matrix.minDistance(word1, word2));
    }
}
