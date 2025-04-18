package leetcode.p2000_2099.p2053_kth_distinct_string_in_an_array;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class KthDistinctStringInAnArrayTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new String[] {"d","b","c","b","c","a"}, 2, "a"),
                arguments(new String[] {"aaa", "aa", "a"}, 1, "aaa"),
                arguments(new String[] {"a", "b", "a"}, 3, "")
        );
    }

    @ParameterizedTest(name = "List {index}")
    @MethodSource("dataProvider")
    public void testList(String[] arr, int k, String expected) {
        KthDistinctStringInAnArray list = new KthDistinctStringInAnArrayList();
        assertEquals(expected, list.kthDistinct(arr, k));
    }
}
