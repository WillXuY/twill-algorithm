package leetcode.p0500_0599.p0500_keyboard_row;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class KeyboardRowTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        new String[] {"Hello", "Alaska", "Dad", "Peace"},
                        new String[] {"Alaska", "Dad"}
                ),
                arguments(
                        new String[] {"omk"},
                        new String[0]
                ),
                arguments(
                        new String[] {"adsdf", "sfd"},
                        new String[] {"adsdf", "sfd"}
                )
        );
    }

    @ParameterizedTest(name = "Count {index}")
    @MethodSource("dataProvider")
    public void testCount(String[] input, String[] expected) {
        KeyboardRow count = new KeyboardRowCount();
        assertArrayEquals(expected, count.findWords(input));
    }
}
