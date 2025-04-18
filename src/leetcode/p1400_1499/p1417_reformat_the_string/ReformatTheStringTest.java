package leetcode.p1400_1499.p1417_reformat_the_string;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class ReformatTheStringTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                // 2. Check the digit index when digits' number larger.
                arguments("ab123", "3a1b2"),
                // 1. move index check before insert char.
                arguments("covid2019", "c2o0v1i9d"),
                arguments("a0b1c2", "a0b1c2"),
                arguments("leetcode", ""),
                arguments("1229857369", "")
        );
    }

    @ParameterizedTest(name = "Insert {index}")
    @MethodSource("dataProvider")
    public void testInsert(String s, String expected) {
        ReformatTheString insert = new ReformatTheStringInsert();
        assertEquals(expected, insert.reformat(s));
    }
}
