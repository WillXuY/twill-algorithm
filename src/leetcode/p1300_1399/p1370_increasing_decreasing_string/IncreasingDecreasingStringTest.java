package leetcode.p1300_1399.p1370_increasing_decreasing_string;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class IncreasingDecreasingStringTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments("aaaabbbbcccc", "abccbaabccba"),
                arguments("rat", "art")
        );
    }

    @ParameterizedTest(name = "TreeMap {index}")
    @MethodSource("dataProvider")
    public void testTreeMap(String s, String expected) {
        IncreasingDecreasingString treeMap
                = new IncreasingDecreasingStringTreeMap();
        assertEquals(expected, treeMap.sortString(s));
    }
}
