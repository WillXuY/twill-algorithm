package leetcode.p2000_2099.p2062_count_vowel_substrings_of_string;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CountVowelSubstringsOfStringTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments("aeiouu", 2),
                arguments("unicornarihan", 0),
                arguments("cuaieuouac", 7)
        );
    }

    @ParameterizedTest(name = "Count {index}")
    @MethodSource("dataProvider")
    public void testCount(String word, int expected) {
        CountVowelSubstringsOfString count =
                new CountVowelSubstringsOfStringCount();
        assertEquals(expected, count.countVowelSubstrings(word));
    }
}
