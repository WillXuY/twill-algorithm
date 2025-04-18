package leetcode.p2100_2199.p2129_capitalize_the_title;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CapitalizeTheTitleTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments("L hV", "l hv"),
                arguments("capiTalIze tHe titLe", "Capitalize The Title"),
                arguments(
                        "First leTTeR of EACH Word",
                        "First Letter of Each Word"
                ),
                arguments("i lOve leetcode", "i Love Leetcode")
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(String title, String expected) {
        CapitalizeTheTitle loop = new CapitalizeTheTitleLoop();
        assertEquals(expected, loop.capitalizeTitle(title));
    }
}
