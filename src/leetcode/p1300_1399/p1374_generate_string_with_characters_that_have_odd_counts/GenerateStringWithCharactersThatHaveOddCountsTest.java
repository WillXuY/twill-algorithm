package leetcode.p1300_1399.p1374_generate_string_with_characters_that_have_odd_counts;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class GenerateStringWithCharactersThatHaveOddCountsTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(4, "baaa"),
                arguments(2, "ba")
        );
    }

    @ParameterizedTest(name = "Fill {index}")
    @MethodSource("dataProvider")
    public void testFill(int n, String expected) {
        GenerateStringWithCharactersThatHaveOddCounts fill
                = new GenerateStringWithCharactersThatHaveOddCountsFill();
        assertEquals(expected, fill.generateTheString(n));
    }
}
