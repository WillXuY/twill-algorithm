package leetcode.p1800_1899.p1816_truncate_sentence;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class TruncateSentenceTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        "Hello how are you Contestant",
                        4,
                        "Hello how are you"
                ),
                arguments(
                        "What is the solution to this problem",
                        4,
                        "What is the solution"
                ),
                arguments(
                        "chopper is not a tanuki",
                        5,
                        "chopper is not a tanuki"
                )
        );
    }

    @ParameterizedTest(name = "Count {index}")
    @MethodSource("dataProvider")
    public void testCount(String s, int k, String expected) {
        TruncateSentence count = new TruncateSentenceCount();
        assertEquals(expected, count.truncateSentence(s, k));
    }
}
