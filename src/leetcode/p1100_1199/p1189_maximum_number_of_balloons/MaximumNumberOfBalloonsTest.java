package leetcode.p1100_1199.p1189_maximum_number_of_balloons;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class MaximumNumberOfBalloonsTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments("nlaebolko", 1),
                arguments("loonbalxballpoon", 2),
                arguments("leetcode", 0)
        );
    }

    @ParameterizedTest(name = "Count {index}")
    @MethodSource("dataProvider")
    public void testCount(String text, int expected) {
        MaximumNumberOfBalloons count = new MaximumNumberOfBalloonsCount();
        assertEquals(expected, count.maxNumberOfBalloons(text));
    }
}
