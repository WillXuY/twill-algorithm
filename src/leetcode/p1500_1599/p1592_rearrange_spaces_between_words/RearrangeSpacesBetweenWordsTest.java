package leetcode.p1500_1599.p1592_rearrange_spaces_between_words;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class RearrangeSpacesBetweenWordsTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        "  this   is  a sentence ",
                        "this   is   a   sentence"
                ),
                arguments(
                        " practice   makes   perfect",
                        "practice   makes   perfect "
                )
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(String text, String expected) {
        RearrangeSpacesBetweenWords loop =
                new RearrangeSpacesBetweenWordsLoop();
        assertEquals(expected, loop.reorderSpaces(text));
    }
}
