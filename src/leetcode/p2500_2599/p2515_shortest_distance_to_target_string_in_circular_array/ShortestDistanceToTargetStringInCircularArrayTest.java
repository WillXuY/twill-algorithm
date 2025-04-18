package leetcode.p2500_2599.p2515_shortest_distance_to_target_string_in_circular_array;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class ShortestDistanceToTargetStringInCircularArrayTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        new String[] {"hello", "i", "am", "leetcode", "hello"},
                        "hello",
                        1,
                        1
                ),
                arguments(
                        new String[] {"a", "b", "leetcode"},
                        "leetcode",
                        0,
                        1
                ),
                arguments(new String[] {"i", "eat", "leetcode"}, "ate", 0, -1)
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(
            String[] words, String target, int startIndex, int expected) {
        ShortestDistanceToTargetStringInCircularArray loop =
                new ShortestDistanceToTargetStringInCircularArrayLoop();
        assertEquals(expected, loop.closetTarget(words, target, startIndex));
    }
}
