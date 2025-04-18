package leetcode.p1300_1399.p1324_print_words_vertically;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrintWordsVerticallyTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.arguments(
                        "HOW ARE YOU",
                        Stream.of(
                                "HAY", "ORO", "WEU"
                        ).collect(Collectors.toList())
                ),
                Arguments.arguments(
                        "TO BE OR NOT TO BE",
                        Stream.of(
                                "TBONTB", "OEROOE", "   T"
                        ).collect(Collectors.toList())
                ),
                Arguments.arguments(
                        "CONTEST IS COMING",
                        Stream.of(
                                "CIC", "OSO", "N M", "T I",
                                "E N", "S G", "T"
                        ).collect(Collectors.toList())
                )
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(String s, List<String> expected) {
        PrintWordsVertically loop = new PrintWordsVerticallyLoop();
        assertEquals(expected, loop.printVertically(s));
    }
}
