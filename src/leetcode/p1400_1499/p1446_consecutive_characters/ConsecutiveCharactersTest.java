package leetcode.p1400_1499.p1446_consecutive_characters;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class ConsecutiveCharactersTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments("abc", 1),
                arguments("leetcode", 2),
                arguments("abbcccddddeeeeedcba", 5)
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(String s, int expected) {
        ConsecutiveCharacters loop = new ConsecutiveCharactersLoop();
        assertEquals(expected, loop.maxPower(s));
    }
}
