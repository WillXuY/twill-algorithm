package leetcode.p2000_2099.p2000_reverse_prefix_of_word;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class ReversePrefixOfWordTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments("abcdefd", 'd', "dcbaefd"),
                arguments("xyxzxe", 'z', "zxyxxe"),
                arguments("abcd", 'z', "abcd")
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(String word, char ch, String expected) {
        ReversePrefixOfWord loop = new ReversePrefixOfWordLoop();
        assertEquals(expected, loop.reversePrefix(word, ch));
    }
}
