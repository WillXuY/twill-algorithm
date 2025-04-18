package leetcode.p2500_2599.p2511_maximum_enemy_forts_that_can_be_captured;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class MaximumEnemyFortsThatCanBeCapturedTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[] {1, 0, 0, -1, 0, 0, 0, 0, 1}, 4),
                arguments(new int[] {0, 0, 1, -1}, 0)
        );
    }

    @ParameterizedTest(name = "Count {index}")
    @MethodSource("dataProvider")
    public void testCount(int[] forts, int expected) {
        MaximumEnemyFortsThatCanBeCaptured count =
                new MaximumEnemyFortsThatCanBeCapturedCount();
        assertEquals(expected, count.captureForts(forts));
    }
}
