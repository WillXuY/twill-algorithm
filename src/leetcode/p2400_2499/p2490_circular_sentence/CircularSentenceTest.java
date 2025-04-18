package leetcode.p2400_2499.p2490_circular_sentence;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CircularSentenceTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments("leetcode exercises sound delightful", true),
                arguments("eetcode", true),
                arguments("Leetcode is cool", false),
                arguments("leetcode", false),
                arguments("Leetcode exercises sound delightful", false)
        );
    }

    @ParameterizedTest(name = "Split {index}")
    @MethodSource("dataProvider")
    public void testSplit(String sentence, boolean expected) {
        CircularSentence split = new CircularSentenceSplit();
        assertEquals(expected, split.isCircularSentence(sentence));
    }
}
