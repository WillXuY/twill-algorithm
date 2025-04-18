package leetcode.p2300_2399.p2315_count_asterisks;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CountAsterisksTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments("l|*e*et|c**o|*de|", 2),
                arguments("iamprogrammer", 0),
                arguments("yo|uar|e**|b|e***au|tifu|l", 5)
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(String s, int expected) {
        CountAsterisks loop = new CountAsterisksLoop();
        assertEquals(expected, loop.countAsterisks(s));
    }
}
