package leetcode.p1800_1899.p1897_redistribute_characters_to_make_all_strings_equal;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class RedistributeCharactersToMakeAllStringsEqualTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new String[] {"abc", "aabc", "bc"}, true),
                arguments(new String[] {"ab", "a"}, false)
        );
    }

    /*
    better: use int[] save count which index is char - 'a';
     */
    @ParameterizedTest(name = "Count {index}")
    @MethodSource("dataProvider")
    public void testCount(String[] words, boolean expected) {
        RedistributeCharactersToMakeAllStringsEqual count =
                new RedistributeCharactersToMakeAllStringsEqualCount();
        assertEquals(expected, count.makeEqual(words));
    }
}
