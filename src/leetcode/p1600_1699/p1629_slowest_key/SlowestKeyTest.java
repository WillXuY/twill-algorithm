package leetcode.p1600_1699.p1629_slowest_key;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class SlowestKeyTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[] {9, 29, 49, 50}, "cbcd", 'c'),
                arguments(new int[] {12, 23, 36, 46, 62}, "spuda", 'a')
        );
    }

    @ParameterizedTest(name = "Index {index}")
    @MethodSource("dataProvider")
    public void testIndex(
            int[] releaseTimes, String keysPressed, char excepetd) {
        SlowestKey index = new SlowestKeyIndex();
        assertEquals(excepetd, index.slowestKey(releaseTimes, keysPressed));
    }
}
