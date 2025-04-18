package leetcode.p1400_1499.p1496_path_crossing;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class PathCrossingTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments("NES", false),
                arguments("NESWW", true)
        );
    }

    @ParameterizedTest(name = "Point {index}")
    @MethodSource("dataProvider")
    public void testPoint(String path, boolean expected) {
        PathCrossing point = new PathCrossingPoint();
        assertEquals(expected, point.isPathCrossing(path));
    }
}
