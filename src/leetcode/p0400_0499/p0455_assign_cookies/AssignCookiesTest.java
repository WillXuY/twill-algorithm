package leetcode.p0400_0499.p0455_assign_cookies;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class AssignCookiesTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        new int[] {1, 5, 9},
                        new int[] {1, 4, 8},
                        2
                ),
                arguments(
                        new int[] {1, 2, 3},
                        new int[] {1, 1},
                        1
                ),
                arguments(
                        new int[] {1, 2},
                        new int[] {1, 2, 3},
                        2
                )
        );
    }

    @ParameterizedTest(name = "Map {index}")
    @MethodSource("dataProvider")
    public void testMap(int[] children, int[] cookies, int expected) {
        AssignCookies map = new AssignCookiesMap();
        assertEquals(expected, map.findContentChildren(children, cookies));
    }
}
