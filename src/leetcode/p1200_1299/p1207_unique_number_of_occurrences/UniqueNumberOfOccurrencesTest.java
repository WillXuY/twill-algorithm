package leetcode.p1200_1299.p1207_unique_number_of_occurrences;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class UniqueNumberOfOccurrencesTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[] {1, 2, 2, 1, 1, 3}, true),
                arguments(new int[] {1, 2}, false),
                arguments(new int[] {-3, 0, 1, -3, 1, 1, 1, -3, 10, 0}, true)
        );
    }

    @ParameterizedTest(name = "Count {index}")
    @MethodSource("dataProvider")
    public void testCount(int[] arr, boolean expected) {
        UniqueNumberOfOccurrences count = new UniqueNumberOfOccurrencesCount();
        assertEquals(expected, count.uniqueOccurrences(arr));
    }
}
