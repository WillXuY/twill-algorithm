package leetcode.p0700_0799.p0799_champagne_tower;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ChampagneTowerTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.arguments(1, 1, 1, 0.0),
                Arguments.arguments(2, 1, 1, 0.5),
                Arguments.arguments(100000009, 33, 17, 1.0)
        );
    }

    @ParameterizedTest(name = "Array {index}")
    @MethodSource("dataProvider")
    public void testArray(int poured, int query_row, int query_glass,
                          double expected) {
        ChampagneTower array = new ChampagneTowerArray();
        assertEquals(expected, array.champagneTower(
                poured, query_row, query_glass));
    }
}
