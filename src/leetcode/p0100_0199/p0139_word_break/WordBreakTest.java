package leetcode.p0100_0199.p0139_word_break;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordBreakTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.arguments(
                        "leetcode",
                        Stream.of(
                                "leet", "code"
                        ).collect(Collectors.toList()),
                        true
                ),
                Arguments.arguments(
                        "applepenapple",
                        Stream.of(
                                "apple", "pen"
                        ).collect(Collectors.toList()),
                        true
                ),
                Arguments.arguments(
                        "catsandog",
                        Stream.of(
                                "cats", "dog", "sand", "and", "cat"
                        ).collect(Collectors.toList()),
                        false
                )
        );
    }

    @ParameterizedTest(name = "Recursive {index}")
    @MethodSource("dataProvider")
    public void testRecursive(String s, List<String> wordDict,
                              boolean expected) {
        WordBreak recursive = new WordBreakRecursive();
        assertEquals(expected, recursive.wordBreak(s, wordDict));
    }
}
