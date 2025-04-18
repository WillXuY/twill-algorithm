package leetcode.p1500_1599.p1576_replace_all_question_marks_to_avoid_consecutive_repeating_characters;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class ReplaceAllQuestionMarksToAvoidConsecutiveRepeatingCharactersTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments("?", "a"),
                arguments("??yw?ipkj?", "abywaipkja"),
                arguments("?zs", "azs"),
                arguments("ubv?w", "ubvaw")
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(String s, String expected) {
        ReplaceAllQuestionMarksToAvoidConsecutiveRepeatingCharacters loop =
                new ReplaceAllQuestionMarksToAvoidConsecutiveRepeatingCharactersLoop();
        assertEquals(expected, loop.modifyString(s));
    }
}
