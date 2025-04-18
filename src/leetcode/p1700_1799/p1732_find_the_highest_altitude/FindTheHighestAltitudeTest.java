package leetcode.p1700_1799.p1732_find_the_highest_altitude;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class FindTheHighestAltitudeTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[] {-5, 1, 5, 0, -7}, 1),
                arguments(new int[] {-4, -3, -2, -1, 4, 3, 2}, 0)
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(int[] gain, int expected) {
        FindTheHighestAltitude loop = new FindTheHighestAltitudeLoop();
        assertEquals(expected, loop.largestAltitude(gain));
    }
}
