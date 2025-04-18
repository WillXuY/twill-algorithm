package leetcode.p2300_2399.p2325_decode_the_message;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class DecodeTheMessageTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        "the quick brown fox jumps over the lazy dog",
                        "vkbs bs t suepuv",
                        "this is a secret"
                ),
                arguments(
                        "eljuxhpwnyrdgtqkviszcfmabo",
                        "zwx hnfx lqantp mnoeius ycgk vcnjrdb",
                        "the five boxing wizards jump quickly"
                )
        );
    }

    @ParameterizedTest(name = "Map {index}")
    @MethodSource("dataProvider")
    public void testMap(String key, String message, String expected) {
        DecodeTheMessage map = new DecodeTheMessageMap();
        assertEquals(expected, map.decodeMessage(key, message));
    }
}
