package leetcode.p0800_0899.p0837_new21_game;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class New21GameTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.arguments(1, 0, 1, 1.0),
                Arguments.arguments(10, 1, 10, 1.0),
                Arguments.arguments(6, 1, 10, 0.6),
                Arguments.arguments(21, 17, 10, 0.73278)
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(int n, int k, int maxPts, double expected) {
        New21Game loop = new New21GameLoop();
        assertEquals(expected, loop.new21Game(n, k, maxPts));
    }
}
