package leetcode.p1900_1999.p1957_delete_characters_to_make_fancy_string;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class DeleteCharactersToMakeFancyStringTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments("leeetcode", "leetcode"),
                arguments("aaabaaaa", "aabaa"),
                arguments("aab", "aab")
        );
    }

    @ParameterizedTest(name = "Count {index}")
    @MethodSource("dataProvider")
    public void testCount(String s, String expected) {
        DeleteCharactersToMakeFancyString count =
                new DeleteCharactersToMakeFancyStringCount();
        assertEquals(expected, count.makeFancyString(s));
    }
}
